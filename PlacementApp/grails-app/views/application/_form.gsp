<%@ page import="placementapp.Application" %>





<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'placement', 'error')} required">
	<label for="placement">
		<g:message code="application.placement.label" default="Placement" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="placement" name="placement.id" from="${placementapp.PlacementOpportunity.list()}" optionKey="id" optionValue="jobTitle" required="" value="${applicationInstance?.placement?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="application.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="status" name="status.id" from="${placementapp.Status.list()}" optionKey="id" optionValue="description" required="" value="${applicationInstance?.status?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: applicationInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="application.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${placementapp.Student.list()}" optionKey="id" optionValue="name" required="" value="${applicationInstance?.student?.id}" class="many-to-one"/>
</div>

