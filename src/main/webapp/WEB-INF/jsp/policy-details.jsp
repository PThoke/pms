<div class="">
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h4>${policyDetails.policyName}</h4>
		</div>
		<div class="panel-body">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th width="15%">Name Of Assured</th>
						<th width="10%">Installment Premium</th>
						<th width="10%">Premium Due From</th>
						<th width="15%">Policy Status</th>
						<th width="10%">Premium Mode</th>
						<th width="15%">Min Sum Assured (Rs.)</th>
						<th width="15%">Nominees</th>
					</tr>
				</thead>
				<tbody>
				<tr>
					<td>${policyDetails.assuredName}</td>
					<td><a href="" id="openModal" data-url="/show-policy-details/${policy.policyId}">${policyDetails.installmentPremium}</a></td>
					<td>${policyDetails.installmentDueDate}</td>
					<td>${policyDetails.policyStatus}</td>
					<td>${policyDetails.policyMode}</td>
					<td>${policyDetails.policySumAssured}</td>
					<td>${policyDetails.nominee}</td>
				</tr>
				</tbody>
			</table>
		</div>
	</div>	
</div>