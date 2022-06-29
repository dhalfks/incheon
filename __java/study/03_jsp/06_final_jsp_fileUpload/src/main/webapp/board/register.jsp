<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../header.jsp" />
<c:set var="ssmvo" value="${ses }" scope="session"/>
<!-- Header -->
<header class="ex-header">
	<div class="container">
		<div class="row">
			<div class="col-xl-10 offset-xl-1">
				<h1 class="text-center">Board Register</h1>
			</div>
			<!-- end of col -->
		</div>
		<!-- end of row -->
	</div>
	<!-- end of container -->
</header>
<!-- end of ex-header -->
<!-- end of header -->


<!-- Basic -->
<div class="ex-form-1 pt-5 pb-5">
	<div class="container">
		<div class="row">
			<div class="col-xl-6 offset-xl-3">
				<div class="text-box mt-5 mb-5">
					<p class="mb-4">
						 <a class="blue" href="#">Log In</a>
					</p>

					<!-- Register Form -->
					<form action="/brd/insert" method="post" enctype="multipart/form-data">
					<div class="mb-4 form-floating">
              <input type="text" class="form-control" id="" name="title"
                placeholder="Board title"> <label for="">Board
                Title</label>
            </div>
            <div class="mb-4 form-floating">
              <input type="text" class="form-control" id="" name="price"
                placeholder="Board Price"> <label for="">Board
                Price</label>
            </div>
            <div class="mb-4 form-floating">
              <input type="text" class="form-control" id="" name="made_by"
                placeholder="Board MadeBy"> <label for="">Board
                Made By</label>
            </div>
						<div class="mb-4 form-floating">
							<input type="email" class="form-control" id="floatingInput" name="writer"
								value="${ssmvo.email }" readonly> <label
								for="floatingInput">Email address</label>
						</div>
						<div class="mb-4 form-floating">
							<input type="text" class="form-control" id="" name="category"
								placeholder="Board Category"> <label for="">Board
								Category</label>
						</div>
						<div class="mb-4 form-floating">
						<textarea rows="" cols="" class="form-control" name="description"></textarea>
               <label for="">Board Description</label>
            </div>
            <div class="mb-4 form-floating">
              <input type="file" class="form-control" id="file" name="imageFile"
                accept="image/png, image/jpeg, image/jpg, image/gif">
                 <label for="file">Image File</label>
            </div>
						<button type="submit" class="form-control-submit-button">Regster</button>
					</form>
					<!-- end of sign up form -->

				</div>
				<!-- end of text-box -->
			</div>
			<!-- end of col -->
		</div>
		<!-- end of row -->
	</div>
	<!-- end of container -->
</div>
<!-- end of ex-basic-1 -->
<!-- end of basic -->

<jsp:include page="../footer.jsp" />