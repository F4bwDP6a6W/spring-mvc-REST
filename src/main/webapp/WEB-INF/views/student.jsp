<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Students Page</title>
	<link href="<c:url value="/resources/common.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>

<div class="container">
	<div class="left">
		<h3>
			Add a Student
		</h3>

		<c:url var="addAction" value="/student/add" ></c:url>

		<form:form action="${addAction}" commandName="student">
			<table>
				<c:if test="${!empty student.firstName}">
					<tr>
						<td>
							<form:label path="id">
								<spring:message text="ID"/>
							</form:label>
						</td>
						<td>
							<form:input path="id" readonly="true" size="8"  disabled="true" />
							<form:hidden path="id" />
						</td>
					</tr>
				</c:if>
				<tr>
					<td>
						<form:label path="firstName">
							<spring:message text="firstName"/>
						</form:label>
					</td>
					<td>
						<form:input path="firstName" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="lastName">
							<spring:message text="lastName"/>
						</form:label>
					</td>
					<td>
						<form:input path="lastName" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="gender">
							<spring:message text="gender"/>
						</form:label>
					</td>
					<td>
						<form:radiobutton path="gender" value="M"/>Male<br>
						<form:radiobutton path="gender" value="F"/>Female
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="birthday">
							<spring:message text="birthday"/>
						</form:label>
					</td>
					<td>
						<form:input type="data" path="birthday" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="uscId">
							<spring:message text="uscId"/>
						</form:label>
					</td>
					<td>
						<form:input path="uscId" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="gpa">
							<spring:message text="gpa"/>
						</form:label>
					</td>
					<td>
						<form:input path="gpa" />
					</td>
				</tr>
				<tr>
					<td>
						<form:label path="mentorId">
							<spring:message text="mentorId"/>
						</form:label>
					</td>
					<td>
						<form:input path="mentorId" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<c:if test="${!empty student.firstName}">
							<input type="submit"
								   value="<spring:message text="Edit Student"/>" />
						</c:if>
						<c:if test="${empty student.firstName}">
							<input type="submit"
								   value="<spring:message text="Add Student"/>" />
						</c:if>
					</td>
				</tr>
			</table>
		</form:form>
	</div>

	<div class="right">

		<h3>Students List</h3>
		<c:if test="${!empty listStudents}">
			<table class="tg">
				<tr>
					<th width="80">Student ID</th>
					<th width="80">Student FirstName</th>
					<th width="80">Student LastName</th>
					<th width="60">Student Gender</th>
					<th width="60"> Student Birthday</th>
					<th width="60">Student GPA</th>
					<th width="60">Student USC ID</th>
					<th width="60">Student Mentor ID</th>
					<th width="60">Edit</th>
					<th width="60">Delete</th>
				</tr>
				<c:forEach items="${listStudents}" var="student">
					<tr>
						<td>${student.id}</td>
						<td>${student.firstName}</td>
						<td>${student.lastName}</td>
						<td>${student.gender}</td>
						<td>${student.birthday}</td>
						<td>${student.gpa}</td>
						<td>${student.uscId}</td>
						<td>${student.mentorId}</td>
						<td><a href="<c:url value='/student/edit/${student.id}' />" >Edit</a></td>
						<td><a href="<c:url value='/student/remove/${student.id}' />" >Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</div>

</body>
</html>
