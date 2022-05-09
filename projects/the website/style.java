let hamburger = document.getElementById("hamburger");

hamburger.addEventListener("click", function () {
  let menuItem = document.getElementsByClassName("menu-item");
  let hamburger = document.getElementById("hamburger");

  for (var i = 0; i < menuItem.length; i++) {
    menuItem[i].classList.toggle("active");
    menuItem[i].classList.toggle("inactive");
  }

  hamburger.classList.toggle("hamburger-open");
  hamburger.classList.toggle("hamburger-close");

  let nav = document.getElementsByClassName("nav");

  for (var i = 0; i < nav.length; i++) {
    nav[i].classList.toggle("nav-active");
  }
});
