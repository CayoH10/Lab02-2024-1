package estruturaDeDados;

public class Array implements Lista {

    private int[] array = new int[20];
    private int tamanho = 0;

    
    @Override
    public boolean buscaElemento(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimo() {
        int min = array[0];
        for (int i = 1; i < tamanho; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int maximo() {
        int max = array[0];
        for (int i = 1; i < tamanho; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int predecessor(int valor) {
        for (int i = 1; i < tamanho; i++) {
            if (array[i] == valor) {
                return array[i - 1];
            }
        }
        return -1;
    }

    @Override
    public int sucessor(int valor) {
        for (int i = 0; i < tamanho - 1; i++) {
            if (array[i] == valor) {
                return array[i + 1];
            }
        }
        return -1;
    }
   

    @Override
    public void insereElemento(int valor) {
        if (tamanho < array.length) {
            array[tamanho++] = valor;
        }
    }

    @Override
    public void remove(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
               
                for (int j = i; j < tamanho - 1; j++) {
                    array[j] = array[j + 1];
                }
                tamanho--;
                break;
            }
        }
    }

   
    @Override
    public int buscaIndice(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    
    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if (buscaIndice >= 0 && buscaIndice <= tamanho) {
           
            for (int i = tamanho - 1; i >= buscaIndice; i--) {
                array[i + 1] = array[i];
            }
            array[buscaIndice] = valor;
            tamanho++;
        } 
    }

    @Override
    public void insereInicio(int valor) {
        insereElementoPosicao(valor, 0);
    }

    @Override
    public void insereFim(int valor) {
        insereElemento(valor);
    }

    @Override
    public void removeIndice(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                array[i] = array[i + 1];
            }
            tamanho--;
        } 
    }

    @Override
    public void removeInicio() {
        if (tamanho > 0) {
            removeIndice(0);
        } 
    }

    @Override
    public void removeFim() {
        if (tamanho > 0) {
            tamanho--;
        }
  }
}
