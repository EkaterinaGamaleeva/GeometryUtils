import geometry.lib.Figure;
import geometry.lib.Rectangle;
import geometry.lib.Triangle;
import  geometry.lib.Сircle;

import java.util.ArrayList;
import java.util.List;

public class TransformationOfFigures {
    private Сircle circle;
    private Triangle triangle;
    private Rectangle rectangle;

    public List<Figure> getFigureList() {
        return figureList;
    }

    private List<Figure> figureList = new ArrayList<>();
    public Figure  comparingFigures(Figure figure1,Figure figure2 )
    {
if (figure1.area()> figure2.area()) {
    return figure1;
}
return figure2;
    }
    public  void  addFigureList( Figure figure)
    {
       figureList.add(figure);
    }
    public  void  deleteFigureList( Figure figure)
    {
        figureList.remove(figure);
    }


}
