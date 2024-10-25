<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/create-user">Add User</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of User's</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th width="15%">First Name</th>
						<th width="15%">last Name</th>
						<th width="15%">Gender</th>
						<th width="15%">Date Of Birth</th>
						<th width="15%">Email Id</th>
						<th width="15%">Contact</th>
						<th width="5%">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${users}" var="user">
						<tr>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.gender}</td>
							<td><fmt:formatDate value="${user.dob}" pattern="dd/MM/yyyy" /></td>
							<td>${user.username}</td>
							<td>${user.contact}</td>
							<%-- <td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy" /></td> --%>
							<td class="float-right"><a type="button" class="glyphicon glyphicon-edit" href="/update-todo?id=${todo.id}"></a>
							<a type="button" class="glyphicon glyphicon-trash" href="/delete-todo?id=${todo.id}"></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>