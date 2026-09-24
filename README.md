# Console E-Commerce System (Java OOP)

Bu proje, bir e-ticaret sisteminin temel backend mantığını simüle eden bir konsol uygulamasıdır. Projenin ana amacı, Nesne Yönelimli Programlama (OOP) prensiplerini ve gerçekçi hata yönetimi standartlarını profesyonel seviyede uygulamaktır.

## 🚀 Özellikler
- **Ürün Yönetimi:** Elektronik ve Gıda gibi farklı ürün kategorileri.
- **Dinamik Sepet:** Farklı tipteki ürünlerin tek bir sepette (Polymorphism) toplanması, `List<Product>` ile esnek boyutlu yönetim.
- **Benzersiz Ürün Kimliği:** Her ürün için 11 haneli, çakışmaya karşı garantili (collision-safe) otomatik ID üretimi.
- **Stok Yönetimi:** Satış işlemi öncesi stok yeterliliği kontrolü, yetersiz veya geçersiz miktar girişlerinde anlamlı hata mesajları.
- **Veri Güvenliği:** Tüm değişkenlerin Encapsulation kurallarına göre korunması ve validasyon kontrolleri.
- **Bağımsız Hata Yönetimi:** Her ürün işlemi kendi hata yakalama bloğunda çalışır; bir üründeki hata diğerlerini etkilemez.

## 🛠 Kullanılan OOP Prensipleri
- **Encapsulation (Kapsülleme):** Değişkenlerin korunması ve mantıksal denetimler (Setter/Getter).
- **Inheritance (Kalıtım):** `Product` ana sınıfından `Electronics` ve `Food` sınıflarına miras aktarımı.
- **Polymorphism (Çok Biçimlilik):** Alt sınıfların üst sınıf referansıyla yönetilmesi.
- **Abstraction (Soyutlama):** `Product`, doğrudan nesne oluşturulamayan bir `abstract class` olarak tasarlandı; her alt sınıf kendi `toString()` implementasyonunu yazmak zorunda.
- **Method Overriding:** Her ürünün kendine has bilgilerini yazdırması için metotların ezilmesi.

## ⚠️ Hata Yönetimi
- Geçersiz veri girişlerinde (`boş isim`, `negatif fiyat/stok` vb.) `IllegalArgumentException` fırlatılır.
- Satış sırasında stok yetersizse veya geçersiz miktar girilirse, hangi ürün ve ne miktarla ilgili olduğunu belirten açıklayıcı hata mesajları üretilir.

## 💻 Kurulum
Projeyi yerel makinenize klonlayıp herhangi bir Java IDE'si (IntelliJ, Eclipse vb.) ile çalıştırabilirsiniz.
