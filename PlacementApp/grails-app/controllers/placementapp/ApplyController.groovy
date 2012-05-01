package placementapp

class ApplyController {

    def index() { }


    def processApplication() { 
        def studentObject = Student.findByName(params.studentName);
        def placementObject = PlacementOpportunity.findByJobTitle(params.jobTitle);
        def statusObject = Status.findByCode('01'); 
    
        log.debug("About to create application for ${params.studentName}, ${params.jobTitle}");

        log.debug("so: ${studentObject}, po:${placementObject}, stat:${statusObject}");

        def createApplication = new Application(student:studentObject,placement:placementObject,status:statusObject);
        createApplication.save();

redirect(controller:"Application")


 }
}


