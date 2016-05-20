var transparentDemo = true;
var fixedTop = false;

$(window).scroll(function(e) {
	oVal = ($(window).scrollTop() / 170);
	$(".blur").css("opacity", oVal);

});



$(function() { // run when the DOM is ready

	var cowAudioElement = document.createElement('audio');
	cowAudioElement.setAttribute('src', '/resources/assets/audio/moo.mp3');
	var catAudioElement = document.createElement('audio');
	catAudioElement.setAttribute('src', '/resources/assets/audio/meow.mp3');
	var birdAudioElement = document.createElement('audio');
	birdAudioElement.setAttribute('src', '/resources/assets/audio/bird.wav');
	var cricketAudioElement = document.createElement('audio');
	cricketAudioElement.setAttribute('src', '/resources/assets/audio/crickets.wav');
	var dogAudioElement = document.createElement('audio');
	dogAudioElement.setAttribute('src', '/resources/assets/audio/dog.wav');
	var duckAudioElement = document.createElement('audio');
	duckAudioElement.setAttribute('src', '/resources/assets/audio/duck.wav');
	var elephantAudioElement = document.createElement('audio');
	elephantAudioElement.setAttribute('src', '/resources/assets/audio/elephant.wav');
	var gooseAudioElement = document.createElement('audio');
	gooseAudioElement.setAttribute('src', '/resources/assets/audio/goose.mp3');
	var owlAudioElement = document.createElement('audio');
	owlAudioElement.setAttribute('src', '/resources/assets/audio/owl.wav');
	var roosterAudioElement = document.createElement('audio');
	roosterAudioElement.setAttribute('src', '/resources/assets/audio/rooster.mp3');
	

	$('.cow').on('click touchstart', function() {
//		stopAllAudio();
		cowAudioElement.play();
	});
	$('.cat').on('click touchstart', function() {
//		stopAllAudio();
		catAudioElement.play();
	});
	$('.bird').on('click touchstart', function() {
//		stopAllAudio();
		birdAudioElement.play();
	});
	$('.cricket').on('click touchstart', function() {
//		stopAllAudio();
		cricketAudioElement.play();
	});
	$('.dog').on('click touchstart', function() {
//		stopAllAudio();
		dogAudioElement.play();
	});
	$('.duck').on('click touchstart', function() {
//		stopAllAudio();
		duckAudioElement.play();
	});
	$('.elephant').on('click touchstart', function() {
//		stopAllAudio();
		elephantAudioElement.play();
	});
	$('.goose').on('click touchstart', function() {
//		stopAllAudio();
		gooseAudioElement.play();
	});
	$('.owl').on('click touchstart', function() {
//		stopAllAudio();
		owlAudioElement.play();
	});
	$('.rooster').on('click touchstart', function() {
//		stopAllAudio();
		roosterAudioElement.play();
	});

	$(".shadowed").on('mousedown touchstart', function() { // use a class, since your ID gets
		// mangled
		$(this).toggleClass("lowered"); // add the class to the clicked element
	});

	$(".shadowed").on('mouseup touchend', function() { // use a class, since your ID gets
		// mangled
		$(this).toggleClass("lowered"); // add the class to the clicked element
	});

});

