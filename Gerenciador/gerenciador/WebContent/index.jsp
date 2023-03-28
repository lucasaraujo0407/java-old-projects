<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
Bem vindo ao nosso gerenciador de empresas!<br/>
	
	<c:if test="${usuarioLogado != null}">
		Você está logado como ${usuarioLogado.email}<br>
	</c:if>
	<form action="executa?tarefa=NovaEmpresa" method="post">
		Nome da empresa: <input type="text" name="nome">
		<input type="submit" value="Enviar">
	</form>
	
	<form action="login" method="post">
		E-mail: <input type="email" name="email" />
		Senha: <input type="password" name="senha" />
		<input type="submit" value="Enviar">
	</form>
	<form action="executa?tarefa=Logout" method="post">
		<input type="submit" value="Logout" />	
	</form>
</body>
</html>