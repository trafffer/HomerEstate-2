const track = document.querySelector('.carousell__track');
const slides = Array.from(track.children);
const indicator = document.querySelector('.carousell__nav')
const dots = Array.from(indicator.children);
const slideWidth = slides[0].getBoundingClientRect().width;

const setSlidePosition =  (slide,index)=> {
    slide.style.width = screen.width.valueOf()*0.30;
    slide.style.left = slideWidth * index + 'px';
};

slides.forEach(setSlidePosition);

let a = 0;
if (a===0) {
    slides[0].className += ' active';
    a++;
}

const currentSlide = track.querySelector('.active')
const nextSlide = currentSlide.nextElementSibling;
nextSlide.className += ' next';

const amountToMove = nextSlide.style.left;

const moveToSlide = (track, currentSlide, targetSlide)=>{
    track.style.transform = 'translateX(-' +targetSlide.style.left;
    currentSlide.classList.remove('active');
    targetSlide.classList.add('active');
}


track.addEventListener('drag',e=>{




})

console.log(nextSlide);

