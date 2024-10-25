<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-sm-12 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add TODO</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
						<form:hidden path="id" />
						<div class="col-sm-6">
							<fieldset class="form-group">
								<form:label path="description">Description</form:label>
								<form:input path="description" type="text" class="form-control"
									required="required" />
								<form:errors path="description" cssClass="text-warning" />
							</fieldset>
						</div>
						<div class="col-sm-6">
							<fieldset class="form-group">
								<form:label path="targetDate">Target Date</form:label>
								<form:input path="targetDate" type="text" class="form-control"
									required="required" />
								<form:errors path="targetDate" cssClass="text-warning" />
							</fieldset>
						</div>
						<button type="submit" class="btn btn-success">Save</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>