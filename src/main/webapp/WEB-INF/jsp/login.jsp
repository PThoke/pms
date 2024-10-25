<nav role="navigation" class="navbar navbar-default">
	<div class="">
		<a href="http://www.javaguides.net" class="navbar-brand"><i>PMS</i></a>
	</div>
	<div class="navbar-collapse">
		<ul class="nav navbar-nav" style="float: right;">
			<li><a href="/register-user">Sign Up</a></li>
		</ul>
	</div>
</nav>
<%@ include file="common/header.jspf"%>
<style>
#container {
    width: 111%;
    max-width: 700px;
    margin: 2em auto;
}
.cols {
    -moz-column-count:3;
    -moz-column-gap: 3%;
    -moz-column-width: 30%;
    -webkit-column-count:3;
    -webkit-column-gap: 3%;
    -webkit-column-width: 30%;
    column-count: 3;
    column-gap: 3%;
    column-width: 30%;
}
.box {
    margin-bottom: 20px;
    height:100px;
    background:#BFBFBF;
    text-align: center;
}
.login-box {
 	width: 40%;
    margin-left: 30%;
    margin-top: 5%;
}
.login-text-box {
	width: 330%
}
</style>
<div class="container">
	<div class="panel panel-primary login-box">
		<div class="panel-heading">Login </div>
		<div class="panel-body">
			<div id="container">
				<div class="cols">
					<form:form method="post" modelAttribute="login" style="margin-top: -15%;">
						<%-- <form:hidden path="id" /> --%>
						<div class="col-sm-12">
							<fieldset class="form-group">
								<form:label path="username">Username</form:label>
								<form:input path="username" type="text" class="form-control login-text-box" required="required" />
								<form:errors path="username" cssClass="text-warning" />
							</fieldset>
						</div>
						<div class="col-sm-12">
							<fieldset class="form-group">
								<form:label path="password">Password</form:label>
								<form:input path="password" type="password" class="form-control login-text-box" required="required" />
								<form:errors path="password" cssClass="text-warning" />
							</fieldset>
						</div>
						<button type="submit" class="btn btn-success" style="width: 265%; margin-left: 10%; margin-top: 10%">Login</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>