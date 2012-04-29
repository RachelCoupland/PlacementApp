import placementapp.Student

class BootStrap {

    def init = { servletContext ->
        def paulStd = new Student(name:'Paul',courseCode:'WSD1',notes:'none').save();
        def richStd = new Student(name:'Richard',courseCode:'WSD1',notes:'no notes here').save();
        def benStd = new Student(name:'Ben',courseCode:'WSD1',notes:'some notes').save();   

}
    def destroy = {
    }
}
