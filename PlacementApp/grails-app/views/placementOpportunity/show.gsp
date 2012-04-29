
<%@ page import="placementapp.PlacementOpportunity" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'placementOpportunity.label', default: 'PlacementOpportunity')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-placementOpportunity" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-placementOpportunity" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list placementOpportunity">
			
				<g:if test="${placementOpportunityInstance?.companyName}">
				<li class="fieldcontain">
					<span id="companyName-label" class="property-label"><g:message code="placementOpportunity.companyName.label" default="Company Name" /></span>
					
						<span class="property-value" aria-labelledby="companyName-label"><g:fieldValue bean="${placementOpportunityInstance}" field="companyName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${placementOpportunityInstance?.jobTitle}">
				<li class="fieldcontain">
					<span id="jobTitle-label" class="property-label"><g:message code="placementOpportunity.jobTitle.label" default="Job Title" /></span>
					
						<span class="property-value" aria-labelledby="jobTitle-label"><g:fieldValue bean="${placementOpportunityInstance}" field="jobTitle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${placementOpportunityInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="placementOpportunity.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${placementOpportunityInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${placementOpportunityInstance?.id}" />
					<g:link class="edit" action="edit" id="${placementOpportunityInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
