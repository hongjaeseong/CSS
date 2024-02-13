console.log("05.js start...");
const boxEl = document.querySelector(".box");
// boxEl.addEventListener('click','로직');
boxEl.addEventListener('click', function(){     // function(){} : 익명함수
    console.log("Clicked..");
    boxEl.style.backgroundColor='orange';
});