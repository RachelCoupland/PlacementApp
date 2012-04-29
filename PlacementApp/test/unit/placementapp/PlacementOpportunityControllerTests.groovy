package placementapp



import org.junit.*
import grails.test.mixin.*

@TestFor(PlacementOpportunityController)
@Mock(PlacementOpportunity)
class PlacementOpportunityControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/placementOpportunity/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.placementOpportunityInstanceList.size() == 0
        assert model.placementOpportunityInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.placementOpportunityInstance != null
    }

    void testSave() {
        controller.save()

        assert model.placementOpportunityInstance != null
        assert view == '/placementOpportunity/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/placementOpportunity/show/1'
        assert controller.flash.message != null
        assert PlacementOpportunity.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/placementOpportunity/list'


        populateValidParams(params)
        def placementOpportunity = new PlacementOpportunity(params)

        assert placementOpportunity.save() != null

        params.id = placementOpportunity.id

        def model = controller.show()

        assert model.placementOpportunityInstance == placementOpportunity
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/placementOpportunity/list'


        populateValidParams(params)
        def placementOpportunity = new PlacementOpportunity(params)

        assert placementOpportunity.save() != null

        params.id = placementOpportunity.id

        def model = controller.edit()

        assert model.placementOpportunityInstance == placementOpportunity
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/placementOpportunity/list'

        response.reset()


        populateValidParams(params)
        def placementOpportunity = new PlacementOpportunity(params)

        assert placementOpportunity.save() != null

        // test invalid parameters in update
        params.id = placementOpportunity.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/placementOpportunity/edit"
        assert model.placementOpportunityInstance != null

        placementOpportunity.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/placementOpportunity/show/$placementOpportunity.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        placementOpportunity.clearErrors()

        populateValidParams(params)
        params.id = placementOpportunity.id
        params.version = -1
        controller.update()

        assert view == "/placementOpportunity/edit"
        assert model.placementOpportunityInstance != null
        assert model.placementOpportunityInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/placementOpportunity/list'

        response.reset()

        populateValidParams(params)
        def placementOpportunity = new PlacementOpportunity(params)

        assert placementOpportunity.save() != null
        assert PlacementOpportunity.count() == 1

        params.id = placementOpportunity.id

        controller.delete()

        assert PlacementOpportunity.count() == 0
        assert PlacementOpportunity.get(placementOpportunity.id) == null
        assert response.redirectedUrl == '/placementOpportunity/list'
    }
}
