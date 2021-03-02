<head>
<jsp:directive.include file="/WEB-INF/jsp/prelude/include-head-meta.jspf" />
	<title>My Home Page</title>
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
</head>
<body>
	<div class="container">
		<form class="form-signin" action="${pageContext.request.contextPath}/success" method="post">
			<h1 class="h3 mb-3 font-weight-normal">注册</h1>
			<label for="name" class="sr-only">用户名：</label>
			<input type="text" name="name" id="name" class="form-control"
				placeholder="请输入用户名" required autofocus>
			<label for="password" class="sr-only">密码：</label>
			<input type="password" name="password" id="password" class="form-control"
				placeholder="请输入密码" required>
			<label for="email" class="sr-only">邮箱：</label>
			<input type="text" name="email" id="email" class="form-control"
				   placeholder="请输入邮箱" required autofocus>
			<label for="phonenumber" class="sr-only">手机号：</label>
			<input type="text" name="phonenumber" id="phonenumber" class="form-control"
				   placeholder="请输入手机号" required autofocus>
			<input name="submit" type="submit" value="提交">
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2021</p>
		</form>
	</div>
</body>