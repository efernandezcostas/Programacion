import java.util.List;

class Operacions <T extends Comparable<T>>{

    public T minimo (List<T> list){
        T min = list.get(0);
        for (T ele : list){
            if (ele.compareTo(min)<0)   min=ele;
        }
        return min;
    }

    public T maximo (List<T> list){
        T max = list.get(0);
        for (T ele : list){
            if (ele.compareTo(max)>0)   max=ele;
        }
        return max;
    }

    public int buscarObjeto (List <T> list, T objeto){
        for (T ele : list){
            if (ele.compareTo(objeto)==0)      return list.indexOf(ele);
        }
        return -1;
    }
}