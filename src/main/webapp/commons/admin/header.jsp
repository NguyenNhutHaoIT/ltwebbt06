<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- Navbar Admin -->
<nav class="navbar navbar-expand-lg navbar-light" 
     style="background: linear-gradient(90deg, #007bff, #00c6ff);">
	<div class="container-fluid">
		<!-- Logo -->
		<a class="navbar-brand fw-bold text-white"
			href="${pageContext.request.contextPath}/admin/home">Admin</a>

		<!-- Toggle cho mobile -->
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#adminNavbar" aria-controls="adminNavbar"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<!-- Menu -->
		<div class="collapse navbar-collapse" id="adminNavbar">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item">
					<a class="nav-link text-white fw-semibold"
						href="${pageContext.request.contextPath}/admin/category/list">Category</a>
				</li>
				<li class="nav-item">
					<a class="nav-link text-white fw-semibold"
						href="${pageContext.request.contextPath}/admin/video/list">Video</a>
				</li>
				<li class="nav-item">
					<a class="nav-link text-white fw-semibold"
						href="${pageContext.request.contextPath}/admin/user/list">User</a>
				</li>
			</ul>

			<!-- Logout -->
			<div class="d-flex">
				<a href="${pageContext.request.contextPath}/logout"
					class="btn btn-outline-light fw-bold">Đăng xuất</a>
			</div>
		</div>
	</div>
</nav>

<style>
	.navbar .nav-link:hover {
		color: #ffe600 !important; /* vàng nhấn khi hover */
		transition: 0.3s;
	}
</style>
