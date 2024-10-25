<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<!-- Bootstrap CSS -->
<!-- Bootstrap JS -->
<!-- <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> -->
<script type="text/javascript">
$(document).ready(function(){
    $('#openModal_1').click(function(event) {
      event.preventDefault(); // Prevent the default anchor behavior
      // Fetch the URL from the data-url attribute
      var url = $(this).data('url');
      //$('#myModal').modal('show');
      
      // Make an AJAX request to load the JSP content
       $.get(url, function(data) {
        // Load the returned content into the modal's body
        $('#modalContent').html(data);
        
        //console.log('datat received frombackend -----'+data);
        // Show the modal
        $('#myModal').modal('show');
      });
    });

     $('#openModal_2').click(function(event) {
        event.preventDefault(); // Prevent the default anchor behavior
        // Fetch the URL from the data-url attribute
        var url = $(this).data('url');
        //$('#myModal').modal('show');
        
        // Make an AJAX request to load the JSP content
         $.get(url, function(data) {
          // Load the returned content into the modal's body
          $('#modalContent').html(data);
          //console.log('datat received frombackend -----'+data);
          // Show the modal
          $('#myModal').modal('show');
        });
      });

    $('#closeModel').click(function(event) {
        event.preventDefault(); // Prevent the default anchor behavior
        
        // Fetch the URL from the data-url attribute
        //var url = $(this).data('url');
        $('#myModal').modal('hide');
        
        // Make an AJAX request to load the JSP content
        /* $.get(url, function(data) {
          // Load the returned content into the modal's body
          $('#modalContent').html(data);
          
          // Show the modal
          $('#myModal').modal('show');
        }); */
      });

    
  });
</script>

<div class="container">
	<!-- <div>
		<a type="button" class="btn btn-primary btn-md" href="/create-user">Add User</a>
	</div> -->
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h4>My Policies</h4>
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
						<!-- <th width="10%">Action</th> -->
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${myPolycies}" var="policy">
						<tr>
							<td>${policy.policyId}</td>
							<td><a href="" id="openModal_${policy.policyId}" data-url="/show-policy-details/${policy.policyId}">${policy.policyName}</a></td>
							<td>${policy.policyType}</td>
							<td>${policy.entryAge}</td>
							<td>${policy.maxMaturityAge}</td>
							<td>${policy.policyTerm}</td>
							<td>${policy.minSumAssured}</td>
							<%-- <td>
								<button type="submit" class="btn btn-success"><a style="color: white;">Buy</a></button>
								<a type="button" class="glyphicon glyphicon-edit" href="/buy-policy?id=${policy.policyId}">Buy</a>
							</td> --%>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<!-- Modal Structure -->
	<div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog modal-dialog-centered" style="width: 90%">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Policy Details</h5>
	      </div>
	      <div class="modal-body">
	        <!-- The JSP content will be loaded here -->
	        <div id="modalContent">
	        	${policyDetails}
	        </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="closeModel">Close</button>
	      </div>
	    </div>
	  </div>
	</div>
	
</div>
<%@ include file="common/footer.jspf"%>