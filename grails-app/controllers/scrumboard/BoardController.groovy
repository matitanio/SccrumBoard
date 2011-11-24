package scrumboard

class BoardController {

    def createBoard = { 
		
		String boardName = params.boardName
		BoardController.metaClass."${boardName}" = this.defaultAction	
//		render "Board Creado para ingresan cliquea en <a href='http://localhost:8080/scrumboard/Polisofia> aqui </a>'"
	}
	
	def defaultAction = {
		
		render "Board de alguien"
	}
	
	
	
	
}
