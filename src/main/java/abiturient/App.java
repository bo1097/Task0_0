/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abiturient;

/**
 *
 * @author bo1097
 */
public class App {
    
    public static void main(String[] args) {
        
        Abiturient ab1 = new Abiturient("Grehovodov","Bogdan","Oleksandrovich","Novgorodska street 25","0607893214", 5,4,3,4,2);
        Abiturient ab2 = new Abiturient("Kolesnikov","Roman","Urevich","Pavlova street 164","0507893214", 4,4,3,5,5);
        Abiturient ab3 = new Abiturient("Stam","Sophia","Oleksandrovna","Ahsarova street 6","0637893214", 5,5,5,5,4);
        Abiturient ab4 = new Abiturient("Galkina","Yana","Igorevna","Pavlova street 67","0506782316", 3,4,3,2,5);
        Abiturient ab5 = new Abiturient("Vasilyev","Saveliy","Olegovich","Derevyanko street 35","0677893214", 5,5,2,2,3);
        Abiturient ab6 = new Abiturient("Ivanov","Ivan","Ivanovich","Sumska street 270","0506789361", 1,4,3,3,2);
        Abiturient ab7 = new Abiturient("Petrov","Peter","Petrovich","Klochkoska street 198","0607893287", 4,4,5,3,3);
        Abiturient ab8 = new Abiturient("Sidorov","Konstantin","Igorevich","Sumska street 13","0506748391", 3,4,4,5,5);
        Abiturient ab9 = new Abiturient("Kovalenko","Darya","Stepanovna","Ahsarova street 19","0634571967", 2,2,3,4,1);
        Abiturient ab10 = new Abiturient("Kondratskiy","Vadim","Dmitrievich","Novgorodska street 93","048973658", 1,3,2,1,3);
    
        Abiturient abArray[] = {ab1,ab2,ab3,ab4,ab5,ab6,ab7,ab8,ab9,ab10};
        
        AbiturientMethod abMethod = new AbiturientMethod(abArray);
        abMethod.abiturient();
        abMethod.badMarks();
        abMethod.byMark(15);
        abMethod.bestMark();
    
    }

    
    
    
}
