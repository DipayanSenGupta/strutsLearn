<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Registration Successful</title>
  </head>
	<body>
		<h3>
			<s:text name="thankyou" />
		</h3>
		<p>Your registration information
			<s:property value="personBean" />
		</p>
		
		<s:if test="personBean.over21">
			<p>You are old enough to vote!</p>
		</s:if>
		<s:else>
			<p>You are old enough to vote!</p>
		</s:else>
		
		<s:if test="personBean.carModels.length > 1">
			<p>Car models</p>
		</s:if>
		<s:else>
			<p>Car model </p>
		</s:else>
		
		selected: </p>
		
		<table style="margin-left:15px">
		    <s:iterator value="personBean.carModels">
		        <tr>
		            <td><s:property/></td>
		        </tr>
		    </s:iterator>
		</table>

		<p>States you may have selected:</p>

		<table style="margin-left:15px">
		    <s:iterator value="states">
		        <tr>
		            <td><s:property value="stateAbbr"/></td>
		            <td><s:property value="stateName"/></td>
		        </tr>
		    </s:iterator>
		</table>

				
		<p>
			<a href="<s:url action='resources/index'/>">Return to home page</a>
		</p>
	</body>
</html>