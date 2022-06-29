<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="../header.jsp"/>
<jsp:include page="../nav.jsp"/>
<div class="container mt-3">
<h2>Emp Modify</h2>
  <form action="./update.em" method="post">
    <div class="mb-3 mt-3">
      <label for="empno" class="form-label">Empno:</label> <input
        type="text" class="form-control" id="empno" value="${evo.empno }"
        name="empno" readonly>
    </div>    
    <div class="mb-3 mt-3">
      <label for="ename" class="form-label">Ename:</label> <input
        type="text" class="form-control" id="ename" value="${evo.ename }"
        name="ename" readonly>
    </div>
    <div class="mb-3 mt-3">
      <label for="job" class="form-label">Job:</label> <input
        type="text" class="form-control" id="job" value="${evo.job }"
        name="job">
    </div>
    <div class="mb-3 mt-3">
      <label for="mgr" class="form-label">MGR:</label> <input
        type="text" class="form-control" id="mgr" value="${evo.mgr }"
        name="mgr">
    </div>
    <div class="mb-3 mt-3">
      <label for="hiredate" class="form-label">Hiredate:</label> <input
        type="date" class="form-control" id="hiredate" value="${evo.hiredate }"
        name="hiredate" readonly>
    </div>
    <div class="mb-3 mt-3">
      <label for="sal" class="form-label">Salary:</label> <input
        type="text" class="form-control" id="sal" value="${evo.sal }"
        name="sal">
    </div>
    <div class="mb-3 mt-3">
      <label for="comm" class="form-label">Comm:</label> <input
        type="text" class="form-control" id="comm" value="${evo.comm }"
        name="comm">
    </div>
    <div class="mb-3 mt-3">
      <label for="deptno" class="form-label">Deptno:</label> <input
        type="text" class="form-control" id="deptno" value="${evo.deptno }"
        name="deptno">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
<jsp:include page="../footer.jsp"/>