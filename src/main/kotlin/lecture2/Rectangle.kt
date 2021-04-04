package lecture2

class Rectangle(x:Int, y:Int, width:Int, height:Int){
    private var x:Int = 0
    private var y:Int = 0
    private var width:Int = 0
    private var height:Int = 0
    constructor(width:Int, height:Int) : this(0, 0, width, height) {}
    init{ //Initializer block
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }
}
