document.addEventListener("DOMContentLoaded", function () {
    const gallery = document.getElementById("gallery");

    // 画像データ（仮のデータです）
    const images = [
        { src: "image1.jpg", id: 1 },
        { src: "image2.jpg", id: 2 },
        { src: "image3.jpg", id: 3 },
    ];

    // ギャラリーに画像を表示
    images.forEach(image => {
        const imageElement = document.createElement("div");
        imageElement.classList.add("image-container");
        
        const img = document.createElement("img");
        img.src = image.src;
        img.alt = "Image";
        
        const likeBtn = document.createElement("button");
        likeBtn.classList.add("like-btn");
        likeBtn.innerHTML = "❤️";
        
        likeBtn.addEventListener("click", function () {
            likeBtn.classList.add("clicked");
            // いいねの処理（例えば、localStorageに保存など）
        });

        imageElement.appendChild(img);
        imageElement.appendChild(likeBtn);
        gallery.appendChild(imageElement);
    });
});
