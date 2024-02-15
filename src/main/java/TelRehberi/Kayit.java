package TelRehberi;

public class Kayit {

    int id; //db için table a ilgili column tanımlandı.
    String isim; //db için table a ilgili column tanımlandı.
    String tel; //db için table a ilgili column tanımlandı.

    public int getId() {    //defaul p.siz cons. var zaten.. geldi otomatik..
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
