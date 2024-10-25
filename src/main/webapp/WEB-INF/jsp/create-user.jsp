<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-sm-10 col-md-offset-1">
			<div class="panel panel-primary">
				<div class="panel-heading">Register User</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="user">
						<form:hidden path="userId" />
						<div class="col-sm-6">
							<fieldset class="form-group">
								<form:label path="firstName">First Name</form:label>
								<form:input path="firstName" type="text" class="form-control" required="required" />
								<form:errors path="firstName" cssClass="text-warning" />
							</fieldset>
						</div>
						<div class="col-sm-6">
							<fieldset class="form-group">
							<form:label path="lastName">Last Name</form:label>
							<form:input path="lastName" type="text" class="form-control" required="required" />
							<form:errors path="lastName" cssClass="text-warning" />
							</fieldset>
						</div>
						
						<div class="col-sm-6">
							<fieldset class="form-group">
							<form:label path="gender">Gender</form:label>
							<form:input path="gender" type="text" class="form-control" required="required" />
							<form:errors path="gender" cssClass="text-warning" />
							</fieldset>
						</div>
						<div class="col-sm-6">
							<fieldset class="form-group">
							<form:label path="dob">Date Of Birth</form:label>
							<form:input path="dob" type="text" class="form-control" required="required" />
							<form:errors path="dob" cssClass="text-warning" />
							</fieldset>
						</div>
						
						<div class="col-sm-6">
							<fieldset class="form-group">
							<form:label path="username">Email Id</form:label>
							<form:input path="username" type="text" class="form-control" required="required" />
							<form:errors path="username" cssClass="text-warning" />
							</fieldset>
						</div>
						<div class="col-sm-6">
							<fieldset class="form-group">
							<form:label path="password">Password</form:label>
							<form:input path="password" type="password" class="form-control" required="required" />
							<form:errors path="password" cssClass="text-warning" />
							</fieldset>
						</div>
						<div class="col-sm-6">
							<fieldset class="form-group">
							<form:label path="confirmPassword">Confirm Password</form:label>
							<form:input path="confirmPassword" type="password" class="form-control" required="required" />
							<form:errors path="confirmPassword" cssClass="text-warning" />
							</fieldset>
						</div>
						<div class="col-sm-6">
							<fieldset class="form-group">
							<form:label path="contact">Contact No</form:label>
							<form:input path="contact" type="text" class="form-control" required="required" />
							<form:errors path="contact" cssClass="text-warning" />
							</fieldset>
						</div>
						
						<div class="col-sm-6">
							<button type="reset" class="btn btn-secondary" style="width: 100%">Reset</button>
						</div>
						<div class="col-sm-6">
							<button type="submit" class="btn btn-success" style="width: 100%">Register</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>