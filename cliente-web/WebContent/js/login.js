
function removeFormEvent() {
	$('.form-signin').submit(function(e) {
	    e.preventDefault();
	    return false;
	});
}

$('.btn-login').click(function(){
	efetuarLoginAjax();
});

function efetuarLoginAjax() {
	
 $.ajax({
	 url : "/cliente-web/LoginServlet",
	 type : 'post',
	 data : {
       txtUsuario : $('#txtUsuario').val(),
       txtSenha : $('#txtSenha').val()
	 },
	beforeSend : function(){
      }
 	})
 	.done(function(msg){
	      $("#resultado").html(msg);
	     })
	 .fail(function(jqXHR, textStatus, msg){
	          alert(msg);
	}); 
	
}