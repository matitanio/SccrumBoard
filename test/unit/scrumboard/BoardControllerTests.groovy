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
		
		//Esto da verde, pero si descomentas la la lienea en la accion createBoard rompe!! porque controller.response.contentAsString tiene el contenido
		// del render de createBoard y no de la accion "Polisofia" que le echufe dinamicamente. Otra cosa que me paso es que hice un ABM pelotudo
		// pero el controller no ve la nueva accions
		
		controller."${boardName}"()
		String response = controller.response.contentAsString
		assert response == "Board de alguien"
    }
	
	
	
}
