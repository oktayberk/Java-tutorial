//ürünü kaydederken kurallara uygun mu dıye kontrol ederiz. is valid dogrumu
//staticlerde newlemeye gerek yok
public class ProductValidator {
    //product validatore diyorum ki ben sana bir tane product veriyorum sen bunu dogrula:
    public static boolean isValid(Product product){
        //yani rünün kaydedilmsi için fiyatı 0 dan buyuk ve ismi girilmiş olamalı
    if (product.price>0 && !product.name.isEmpty()){ //isEmpty() boşs. Başında ! varsa boş degilse
        return true;
    }
    else {
        return false;

    }
    }
}
