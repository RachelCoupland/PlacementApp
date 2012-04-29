import placementapp.Student
import placementapp.Application
import placementapp.PlacementOpportunity
import placementapp.Status

class BootStrap {

    def init = { servletContext ->
        def paulStd = new Student(name:'Paul',courseCode:'WSD1',notes:'none').save();
        def richStd = new Student(name:'Richard',courseCode:'WSD1',notes:'no notes here').save();
        def benStd = new Student(name:'Ben',courseCode:'WSD1',notes:'some notes').save();   

        def appliedStatus = new Status(code:'01', description:'Applied').save();
        def notInvitedStatus = new Status(code:'02', description:'Not invited for interview').save();
        def invitedStatus = new Status(code:'03', description:'Invited for Interview').save();
        def notOfferedStatus = new Status(code:'04', description:'Not Offered').save();
        def offeredStatus = new Status(code:'05', description:'Offered').save();
        def acceptedStatus = new Status(code:'06', description:'Accepted').save();
        def rejectedStatus = new Status(code:'07', description:'Rejected').save();
        
        def blueSquare = new PlacementOpportunity(jobTitle:'Junior programmer', companyName:'blueSquare', status:'open').save();
        def orangeCircle = new PlacementOpportunity(jobTitle:'Junior web developer', companyName:'orangeCircle', status:'open').save();
        def greenTriangle = new PlacementOpportunity(jobTitle:'Assistant designer', companyName:'greenTriangle', status:'closed').save();
       
}
    def destroy = {
    }
}
