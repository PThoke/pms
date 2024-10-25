<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<!-- <div>
		<a type="button" class="btn btn-primary btn-md" href="/create-user">Add User</a>
	</div> -->
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h4>All Policies</h4>
		</div>
		<div class="panel-body">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th width="5%">Policy Code</th>
						<th width="20%">Policy Name</th>
						<th width="5%">Policy Type</th>
						<th width="15%">Entry Age</th>
						<th width="20%">Max Maturity Age</th>
						<th width="10%">Policy Term</th>
						<th width="15%">Min Sum Assured (Rs.)</th>
						<th width="10%">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${policies}" var="policy">
						<tr>
							<td>${policy.policyId}</td>
							<td>${policy.policyName}</td>
							<td>${policy.policyType}</td>
							<td>${policy.entryAge}</td>
							<td>${policy.maxMaturityAge}</td>
							<td>${policy.policyTerm}</td>
							<td>${policy.minSumAssured}</td>
							<td>
								<button type="submit" class="btn btn-success"><a style="color: white;" href="/buy-policy?policyId=${policy.policyId}">Buy</a></button>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>