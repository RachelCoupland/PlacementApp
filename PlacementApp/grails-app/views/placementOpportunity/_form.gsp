<%@ page import="placementapp.PlacementOpportunity" %>



<div class="fieldcontain ${hasErrors(bean: placementOpportunityInstance, field: 'companyName', 'error')} ">
	<label for="companyName">
		<g:message code="placementOpportunity.companyName.label" default="Company Name" />
		
	</label>
	<g:textField name="companyName" value="${placementOpportunityInstance?.companyName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placementOpportunityInstance, field: 'jobTitle', 'error')} ">
	<label for="jobTitle">
		<g:message code="placementOpportunity.jobTitle.label" default="Job Title" />
		
	</label>
	<g:textField name="jobTitle" value="${placementOpportunityInstance?.jobTitle}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: placementOpportunityInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="placementOpportunity.status.label" default="Status" />
		
	</label>
	<g:textField name="status" value="${placementOpportunityInstance?.status}"/>
</div>

