<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">

	<div class="panel panel-primary">
		<div class="panel-heading">Home Page</div>
		<div class="panel-body">
			<div id="container">
				<div class="cols">
					<!-- <div class="panel-heading">Dashboard</div> -->
					<%-- <div class="panel-body">
						Welcome ${name}!! <a href="/list-todos">Click here</a> to manage your todo's.
					</div> --%>
				    <div class="box" style="background:#31a845 " ><a href="/create-user">Create Customer</a></div>
				    <div class="box" style="background:#31a845 " ><a href="/create-user">Create Administrator</a></div>
				    <div class="box" style="background:#31a845 " ><a href="/list-user">List User</a></div>
				    <div class="box" style="background:#9a74d7">Create Policy</div>
				    <div class="box" style="background:#9a74d7">My Own Policy</div>
				    <div class="box" style="background:#56d48a">Buy Policy</div>
				    <!-- <div class="box" style="background:#d5826d">Upcoming Polices</div> -->
				    <!-- <div class="box" style="background:orange;">Policies On Due</div> -->
				    <!-- <div class="box"style="background:red">Policy Lapsed</div> -->
				</div>
				</div>
			</div>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>