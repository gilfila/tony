var transparentDemo = true;
var fixedTop = false;

$(window).scroll(function(e) {
	oVal = ($(window).scrollTop() / 170);
	$(".blur").css("opacity", oVal);

});

$(function() { // run when the DOM is ready

	var cowAudioElement = document.createElement('audio');
	cowAudioElement.setAttribute('src', 'assets/audio/moo.mp3');
	var catAudioElement = document.createElement('audio');
	catAudioElement.setAttribute('src', 'assets/audio/meow.mp3');
	var birdAudioElement = document.createElement('audio');
	birdAudioElement.setAttribute('src', 'assets/audio/bird.wav');
	var cricketAudioElement = document.createElement('audio');
	cricketAudioElement.setAttribute('src', 'assets/audio/crickets.wav');
	var dogAudioElement = document.createElement('audio');
	dogAudioElement.setAttribute('src', 'assets/audio/dog.wav');
	var duckAudioElement = document.createElement('audio');
	duckAudioElement.setAttribute('src', 'assets/audio/duck.wav');
	var elephantAudioElement = document.createElement('audio');
	elephantAudioElement.setAttribute('src', 'assets/audio/elephant.wav');
	var gooseAudioElement = document.createElement('audio');
	gooseAudioElement.setAttribute('src', 'assets/audio/goose.mp3');
	var owlAudioElement = document.createElement('audio');
	owlAudioElement.setAttribute('src', 'assets/audio/owl.wav');
	var roosterAudioElement = document.createElement('audio');
	roosterAudioElement.setAttribute('src', 'assets/audio/rooster.mp3');

	$('.cow').on('click touchstart', function() {
		cowAudioElement.play();
	});
	$('.cat').on('click touchstart', function() {
		catAudioElement.play();
	});
	$('.bird').on('click touchstart', function() {
		birdAudioElement.play();
	});
	$('.cricket').on('click touchstart', function() {
		cricketAudioElement.play();
	});
	$('.dog').on('click touchstart', function() {
		dogAudioElement.play();
	});
	$('.duck').on('click touchstart', function() {
		duckAudioElement.play();
	});
	$('.elephant').on('click touchstart', function() {
		elephantAudioElement.play();
	});
	$('.goose').on('click touchstart', function() {
		gooseAudioElement.play();
	});
	$('.owl').on('click touchstart', function() {
		owlAudioElement.play();
	});
	$('.rooster').on('click touchstart', function() {
		roosterAudioElement.play();
	});

	$(".shadowed").on('mousedown touchstart', function() { // use a class, since your ID gets
		// mangled
		$(this).toggleClass("lowered"); // add the class to the clicked element
		$("moo").play();
	});

	$(".shadowed").on('mouseup touchend', function() { // use a class, since your ID gets
		// mangled
		$(this).toggleClass("lowered"); // add the class to the clicked element
	});

});

