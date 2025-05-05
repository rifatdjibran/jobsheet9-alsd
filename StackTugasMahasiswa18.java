public class StackTugasMahasiswa18 {
 
    Mahasiswa18[] stack;
    int size, top;

    public StackTugasMahasiswa18(int size) {
        this.size = size;
        stack = new Mahasiswa18[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa18 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa18 pop() {
        if (!isEmpty()) {
            Mahasiswa18 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa18 peek() {
        if (!isEmpty()) {
            System.out.println("Tugas teratas: " + stack[top].nim + " - " + stack[top].nama);
            return stack[top];
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa18 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong, tidak ada tugas terbawah.");
            return null;
        }
    }
    
    public int jumlahTugas() {
        return top + 1;
    }
    

    public void printStack() {
        if (!isEmpty()) {
            System.out.println("Daftar tugas yang belum dinilai:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
            System.out.println("");
        } else {
            System.out.println("Stack kosong, tidak ada tugas untuk diprint.");
        }
    }
}