package scrumboard

import grails.test.*

class BoardControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

	
    void testcreateBord() {

		String boardName = "Polisofia"
		controller.params.boardName = boardName
		controller.createBoard()
		
		
		controller."${boardName}"()
		String response = controller.response.contentAsString
		assert response == "Board de alguien"
    }
	
	
	
}
