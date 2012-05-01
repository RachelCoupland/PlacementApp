package placementapp

class Application {

        Student student
        PlacementOpportunity placement
        Status status
        String timestamp


    static constraints = {
        timestamp(nullable:true)
    }
}
