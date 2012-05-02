package placementapp

class PlacementOpportunity {

        String jobTitle
        String companyName
        String status
        static hasMany = [applicants:Application]
        static mappedBy = [applicants:'placement']


    static constraints = {
    }
}
