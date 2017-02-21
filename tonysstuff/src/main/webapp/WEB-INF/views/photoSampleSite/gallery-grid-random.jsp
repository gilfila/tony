<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<title>Gallery | Emilie - Photography Portfolio HTML Template</title>

<!--Bootstrap Element and Grid System-->
<link href="/resources/gilfillanPhotoAssets/css/bootstrap.css" rel="stylesheet" type="text/css">

<!--jQuery UI CSS-->
<link href="/resources/gilfillanPhotoAssets/css/jquery-ui.css" rel="stylesheet" type="text/css">

<!--Main Elements CSS-->
<link href="/resources/gilfillanPhotoAssets/css/style.css" rel="stylesheet" type="text/css">

<!--Font Awesome-->
<link href="fonts/font-awesome-4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- Core GalleryJack CSS Files -->
<link href="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/css/cj_gallery.css?v=1" rel="stylesheet" type="text/css">
<link href="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/css/cj_gallery_video.css?v=1" rel="stylesheet" type="text/css">
<!--[if lte IE 8 ]><link rel="stylesheet" type="text/css" href="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/css/cj_gallery_ie_8.css?v=1" /><![endif]-->
<!--[if lte IE 7 ]><link rel="stylesheet" type="text/css" href="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/css/cj_gallery_ie_7.css?v=1" /><![endif]-->

<!--OWL Carousel CSS-->
<link href="/resources/gilfillanPhotoAssets/bower_components/owl.carousel.2.0.0/assets/owl.carousel.css" rel="stylesheet" type="text/css">
<link href="/resources/gilfillanPhotoAssets/bower_components/owl.carousel.2.0.0/assets/owl.theme.default.css" rel="stylesheet" type="text/css">

<!--Megafolio CSS-->
<link href="/resources/gilfillanPhotoAssets/bower_components/megafolio/css/settings.css" rel="stylesheet" type="text/css">

<!--FancyBox CSS-->
<link href="/resources/gilfillanPhotoAssets/bower_components/fancybox/jquery.fancybox.css?v=2.1.5" rel="stylesheet" type="text/css">

<!--FlexSlider CSS-->
<link href="/resources/gilfillanPhotoAssets/bower_components/FlexSlider/flexslider.css" rel="stylesheet" type="text/css">

<!--jQuery Fullpage CSS-->
<link href="/resources/gilfillanPhotoAssets/css/jquery.fullPage.css" rel="stylesheet" type="text/css">

<!--Tootips CSS-->
<link href="/resources/gilfillanPhotoAssets/bower_components/tooltipster/css/tooltipster.css" rel="stylesheet" type="text/css">
<link href="/resources/gilfillanPhotoAssets/bower_components/tooltipster/css/themes/custom-theme01.css" rel="stylesheet" type="text/css">
<link href="/resources/gilfillanPhotoAssets/bower_components/tooltipster/css/themes/custom-theme02.css" rel="stylesheet" type="text/css">
<link href="/resources/gilfillanPhotoAssets/bower_components/tooltipster/css/themes/custom-theme03.css" rel="stylesheet" type="text/css">

<!--Google Fonts-->
<link href='http://fonts.googleapis.com/css?family=Play:400,700%7CRoboto:500,400italic,700italic,300,700,500italic,300italic,400&amp;subset=latin,latin-ext' rel='stylesheet' type='text/css'>

</head>

<body class="pageScroll">
	
    <!--Pre Loading Start-->
    <div class="preloader-wrapper">
        <div class="loader">
            <div class="square"></div>
            <div class="square"></div>
            <div class="square last"></div>
            <div class="square clear"></div>
            <div class="square"></div>
            <div class="square last"></div>
            <div class="square clear"></div>
            <div class="square"></div>
            <div class="square last"></div>
        </div>
    </div>
    <!--Pre Loading End-->
    
    <!--Overlay Navigation Menu Start-->
    <div class="overlay overlay-hugeinc" data-image-src="/resources/gilfillanPhotoAssets/images/upload/overlay-menu-bg.jpg">
        <div class="overlay-nav-wrapper">
            <div class="container">
            	
                <!--Menu Close Start-->
                <div class="menu-close-wrapper">
                	<div class="container">
                    	<div class="menu-close">
                            <span>Close</span>
                            <div class="overlay-close"></div>
                        </div>
                    </div>
                </div>
                <!--Menu Close End-->
                
                <!--Navigation Menu Start-->
                <nav class="main-menu">
                    <ul>
                        <li><a href="index.html">Home</a>
                            <ul>
                                <li><a href="index.html"><span data-hover="Homepage one">Homepage one</span></a></li>
                                <li><a href="homepage-two.html"><span data-hover="Homepage two">Homepage two</span></a></li>
                                <li><a href="homepage-three.html"><span data-hover="Homepage three">Homepage three</span></a></li>
                                <li><a href="homepage-four.html"><span data-hover="Homepage four">Homepage four</span></a></li>
                            </ul>
                        </li>
                        <li><a href="about-us-studio.html">About Us</a>
                            <ul>
                                <li><a href="about-us-personal.html"><span data-hover="Personal photography">Personal photography</span></a></li>
                                <li><a href="about-us-studio.html"><span data-hover="Studio photography">Studio photography</span></a></li>
                            </ul>
                        </li>
                        <li><a href="#">Galleries</a>
                            <ul>
                                <li><a href="gallery-one.html"><span data-hover="Gallery one">Gallery one</span></a></li>
                                <li><a href="gallery-two.html"><span data-hover="Gallery two">Gallery two</span></a></li>
                                <li><a href="gallery-three.html"><span data-hover="Gallery three">Gallery three</span></a></li>
                                <li><a href="gallery-four.html"><span data-hover="Gallery four">Gallery four</span></a></li>
                            </ul>
                        </li>
                        <li><a href="#">Gallery Single</a>
                            <ul>
                                <li><a href="gallery-single-one.html"><span data-hover="Gallery single one">Gallery single one</span></a></li>
                                <li><a href="gallery-single-two.html"><span data-hover="Gallery single two">Gallery single two</span></a></li>
                                <li><a href="gallery-single-three.html"><span data-hover="Gallery single three">Gallery single three</span></a></li>
                            </ul>
                        </li>
                        <li><a href="#">Blog</a>
                            <ul>
                                <li><a href="blog-standard.html"><span data-hover="Blog standard">Blog standard</span></a></li>
                                <li><a href="blog-masonry.html"><span data-hover="Blog masonry">Blog masonry</span></a></li>
                                <li><a href="blog-single.html"><span data-hover="Blog single">Blog single</span></a></li>
                            </ul>
                        </li>
                        <li><a href="prices.html">Prices</a></li>
                        <li><a href="contact.html">Contact Us</a></li>
                        <li><a href="elements.html">Elements</a></li>
                    </ul>
                </nav>
                <!--Navigation Menu End-->
                
            </div>
        </div>
        <div class="color-overlay"></div>
    </div>
    <!--Overlay Navigation Menu End-->
    
	<!--Header Section Start-->
    <header class="header-section">
    	<div class="container">
        
        	<!--Logo Start-->
        	<div class="logo">
            	<a href="index.html"><img src="/resources/gilfillanPhotoAssets/images/logo.png" alt="logo" /></a>
            </div>
            <!--Logo End-->
            
            <!--Menu Open Start-->
            <div class="menu-open">
            	<span>Menu</span>
                <div id="trigger-menu" class="burger-menu"><span></span></div>
            </div>
            <!--Menu Open End-->
            
            <!--Header Phone Start-->
            <div class="header-phone">
            	1 800 123 6789
            </div>
            <!--Header Phone Start-->
            
        </div>
        
    </header>
    <!--Header Section End-->
	
    <div id="fullpage" class="fullpageDisable"></div>
    
    <!--Whole Content Wrapper Start-->
	<div class="content-wrapper">
		   <!--Slider Area Start-->
        <div class="slide-wrapper home-slide">
        	<div class="flexslider">
                <ul class="slides">
                
                	<!--Slide 1 Start-->
                    <li>
						<div class="home-slide-overlay" data-bg-color="#1e1e1e" data-opacity="0.3"></div>
						<img src="/resources/gilfillanPhotoAssets/images/upload/home-slider05.jpg" alt="slide image" />
                        
                        <!--Slider Caption Start-->
						<div class="flex-caption">
							<div class="container">
                            	<div class="caption-detail-wrapper no-number">
                            		<div class="caption-detail">
                            			<h1>Donec amet enim</h1>
                            			<div class="caption-description">
                            				Suspendise mattis condimentum ultricies cras enim facilis<br>condimentum lacinia turpis maecenas.
                            			</div>
                            			<button class="large-button icon blue" onClick="location.href='#'">
                            				<i class="fa fa-camera"></i>Go to gallery
                            			</button>
                            		</div>
                                </div>
							</div>
						</div>
                        <!--Slider Caption End-->
                        
                    </li>
                    <!--Slide 1 End-->
                    
                    <!--Slide 2 Start-->
                    <li>
						<div class="home-slide-overlay" data-bg-color="#1e1e1e" data-opacity="0.3"></div>
						<img src="/resources/gilfillanPhotoAssets/images/upload/home-slider06.jpg" alt="slide image" />
                        
                        <!--Slider Caption Start-->
						<div class="flex-caption">
							<div class="container">
                            	<div class="caption-detail-wrapper no-number">
                            		<div class="caption-detail">
                            			<h1>Quisque vitae eros</h1>
                            			<div class="caption-description">
                            				Aenean et tortor vitae diam cursus ornare sit amet in tempor<br>pellentesque libero nec risus porta.
                            			</div>
                            			<button class="large-button icon dark-grey" onClick="location.href='#'">
                            				<i class="fa fa-camera"></i>Go to gallery
                            			</button>
                            		</div>
                                </div>
							</div>
						</div>
                        <!--Slider Caption End-->
                        
                    </li>
                    <!--Slide 2 End-->
                    
                    <!--Slide 3 Start-->
                    <li>
						<div class="home-slide-overlay" data-bg-color="#1e1e1e" data-opacity="0.3"></div>
						<img src="/resources/gilfillanPhotoAssets/images/upload/home-slider07.jpg" alt="slide image" />
                        
                        <!--Slider Caption Start-->
						<div class="flex-caption">
							<div class="container">
                            	<div class="caption-detail-wrapper no-number">
                            		<div class="caption-detail">
                            			<h1>Curabit sed lacus</h1>
                            			<div class="caption-description">
                            				Aenean pretium quam in orci egestas lobortis viverra pulvinar<br>malesuada semper sed euismod quis.
                            			</div>
                            			<button class="large-button icon blue" onClick="location.href='#'">
                            				<i class="fa fa-camera"></i>Go to gallery
                            			</button>
                            		</div>
                                </div>
							</div>
						</div>
                        <!--Slider Caption End-->
                        
                    </li>
                    <!--Slide 3 End-->
                    
                    <!--Slide 4 Start-->
                    <li>
						<div class="home-slide-overlay" data-bg-color="#1e1e1e" data-opacity="0.3"></div>
						<img src="/resources/gilfillanPhotoAssets/images/upload/home-slider08.jpg" alt="slide image" />
                        
                        <!--Slider Caption Start-->
						<div class="flex-caption">
							<div class="container">
                            	<div class="caption-detail-wrapper no-number">
                            		<div class="caption-detail">
                            			<h1>Sed euismod quis</h1>
                            			<div class="caption-description">
                            				Praesent cursus neque urna sit amet fringilla aliquam volupa<br>pellentesque sed a eleifend leo posuere.
                            			</div>
                            			<button class="large-button icon blue" onClick="location.href='#'">
                            				<i class="fa fa-camera"></i>Go to gallery
                            			</button>
                            		</div>
                                </div>
							</div>
						</div>
                        <!--Slider Caption End-->
                        
                    </li>
                    <!--Slide 4 End-->
                    
                </ul>
            </div>
            
            <!--Custom Navigation Start-->
            <ul class="slide-nav">
            	<li>
            		<a class="slide-prev" href="prev"><i class="fa fa-angle-left"></i></a>
                </li>
                <li>
                    <a class="slide-next" href="next"><i class="fa fa-angle-right"></i></a>
                </li>
            </ul>
            <!--Custom Navigation End-->
            
        </div>
        <!--Slider Area End-->
	
	
        <!--Featured Area Start-->        
        <div class="featured-area fit-height" data-image-src="/resources/gilfillanPhotoAssets/colleensPics/frontPageSlider/img1.jpg">
			<div class="featured-area-overlay">
            	<div class="featured-area-caption">
                	<div class="container">
                    	<div class="box animate-fadeInDown">
                            <h1>Aenean gravid</h1>
                            <div class="featured-description">
                                Sed fringilla egestas condimentum morbi urna
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--Featured Area End-->
        
        <!--Category Filter Start-->
        <div class="category-filter">
			<div class="container">
				<h2>Galleries</h2>
				<ul>
					<li class="filter selected" data-category="cat-all">All Categories</li>
					<li class="filter" data-category="cat-one">Nullam</li>
					<li class="filter" data-category="cat-two">Aliquam</li>
					<li class="filter" data-category="cat-three">Quisque</li>
					<li class="filter" data-category="cat-four">Maecenas</li>
					<li class="filter" data-category="cat-five">Gravida</li>
				</ul>
				<div class="see-all-top photo-currently"><span>500</span> Photos are currently</div>
			</div>
        </div>
        <!--Category Filter End-->
        
		<!--Gallery Items Start-->
		<div class="gallery-grid-random" data-bg-color="#f2f2f2">
			<div class="megafolio-container norounded noborder">
                
				<!--Gallery Item 1 Start-->
				<div class="mega-entry cat-all cat-three cat-four cat-two" id="entry-1" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set01-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set01-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Quisque sapien neque</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 1 End-->
                    
				<!--Gallery Item 2 Start-->
				<div class="mega-entry cat-all cat-one cat-three cat-four" id="entry-2" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set02-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set02-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Suspendisse purus</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 2 End-->
                    
				<!--Gallery Item 3 Start-->
				<div class="mega-entry cat-all cat-two cat-four cat-five" id="entry-3" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set03-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set03-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Curabitur</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 3 End-->
                    
				<!--Gallery Item 4 Start-->
				<div class="mega-entry cat-all cat-one cat-two cat-five" id="entry-4" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set04-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set04-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Donec tellus</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 4 End-->
                    
				<!--Gallery Item 5 Start-->
				<div class="mega-entry cat-all cat-three cat-five" id="entry-5" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set05-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set05-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Sed fermentum</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 5 End-->
                    
				<!--Gallery Item 6 Start-->
				<div class="mega-entry cat-all cat-two cat-five cat-three" id="entry-6" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set06-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set06-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Nullam fringilla</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 6 End-->
                    
				<!--Gallery Item 7 Start-->
				<div class="mega-entry cat-all cat-one cat-four" id="entry-7" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set07-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set07-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Aenean tortor</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 7 End-->
                
                <!--Gallery Item 8 Start-->
				<div class="mega-entry cat-all cat-three cat-four cat-five" id="entry-8" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set08-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set08-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Fuisque dapien meque</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 8 End-->
                    
				<!--Gallery Item 9 Start-->
				<div class="mega-entry cat-all cat-one cat-three" id="entry-9" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set09-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set09-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Quspendisse curus</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 9 End-->
                    
				<!--Gallery Item 10 Start-->
				<div class="mega-entry cat-all cat-two cat-four" id="entry-10" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set10-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set10-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Gurabitur</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 10 End-->
                    
				<!--Gallery Item 11 Start-->
				<div class="mega-entry cat-all cat-one cat-two" id="entry-11" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set11-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set11-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Tonec cellus</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 11 End-->
                    
				<!--Gallery Item 12 Start-->
				<div class="mega-entry cat-all cat-three cat-five" id="entry-12" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set12-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set12-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Set germentum</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 12 End-->
                    
				<!--Gallery Item 13 Start-->
				<div class="mega-entry cat-all cat-one cat-two cat-five" id="entry-13" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set13-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set13-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Pullam fringilla</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 13 End-->
                    
				<!--Gallery Item 14 Start-->
				<div class="mega-entry cat-all cat-one cat-four" id="entry-14" data-src="/resources/gilfillanPhotoAssets/images/upload/gallery-set14-image01-thumb.jpg" data-width="800" data-height="600">
                    
					<!--The Container For The Hover Effect-->
					<a class="fancybox" data-fancybox-group="home-gallery" href="/resources/gilfillanPhotoAssets/images/upload/gallery-set14-image01.jpg">
						<div class="overlay-hover xcross-hover">
							<h3 class="text-hover">Genean portor</h3>
						</div>
					</a>
					<!--End Of The Hover Effect Markup-->
                    
				</div>
				<!--Gallery Item 14 End-->
                
			</div>
		</div>
		<!--Gallery Items End-->
        
        <!--Pagination Start-->
        <div class="pagination-wrapper">
        	<div class="container">
        		<nav class="pagination">
                	<ul>
                    	<li class="pagination-active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                    </ul>
                </nav>
            </div>
        </div>
        <!--Pagination End-->
        
        <!--Footer Area Start-->
        <div class="footer-section">
        	<div class="footer-detail">
            	<div class="container">
                	<div class="row">
                    
                    	<!--Footer Logo Start-->
                    	<div class="col-sm-6 col-sm-offset-3 col-md-4 col-md-offset-4">
                        	<div class="box footer-logo animate-fadeIn">
                            	<a href="#"><img src="/resources/gilfillanPhotoAssets/images/logo-footer.png" alt="logo footer" /></a>
                            </div>
                        </div>
                        <!--End-->
                        
                        <div class="clearfix"></div>
                        
                        <!--Footer Description Start-->
                        <div class="col-md-8 col-md-offset-2">
                        	<div class="box footer-description animate-fadeIn">
                            	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut mauris magna, lacinia ac purus quis, rutrum bibendum leo. Nullam sit amet nibh eu odio ornare laoreet. Duis imperdiet est ut tristique auctor.</p>
                            </div>
                        </div>
                        <!--End-->
                        
                        <div class="clearfix"></div>
                        
                        <!--Footer Social Media Start-->
                        <div class="col-md-8 col-md-offset-2">
                            <ul class="footer-social animate-fadeIn">
                                <li class="footer-facebook"><a href="#" target="_blank"><i class="fa fa-facebook"></i></a></li>
                                <li class="footer-twitter"><a href="#" target="_blank"><i class="fa fa-twitter"></i></a></li>
                                <li class="footer-instagram"><a href="#" target="_blank"><i class="fa fa-instagram"></i></a></li>
                                <li class="footer-google-plus"><a href="#" target="_blank"><i class="fa fa-google"></i></a></li>
                                <li class="footer-pinterest"><a href="#" target="_blank"><i class="fa fa-pinterest-p"></i></a></li>
                            </ul>
                        </div>
                        <!--End-->
                        
                    </div>
                </div>
            </div>
            <div class="footer-bottom">
            	
            	<!--Copyright Start-->
            	<div class="container">
                	Copyrights © 2015 <a href="#">Emilie</a>. All Rights Reserved.
                </div>
                <!--End-->
                
                <!--Go To Top Start-->
                <div class="goto-top">
                	<a href="#top">
                    	<i class="fa fa-angle-up"></i>
                    </a>
                </div>
                <!--End-->
                
            </div>
        </div>
        <!--Footer Area End-->
        
    </div>
    <!--Whole Content Wrapper End-->

<!--jQuery files-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/vendor/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/vendor/modernizr.custom.js"></script>
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/vendor/jquery.easings.min.js"></script>
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/classie.js"></script>
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/vendor/jquery-ui.min.js"></script>
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/menu.js"></script>
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/jquery.viewport.js"></script>

<!--jQuery Retina-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/retina.js"></script>

<!-- GalleryJack Scripts -->
<script src="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/js/jquery.address-1.5.min.js" type="text/javascript"></script>
<script src="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/js/cj-galleryjack-core.js?v=1" type="text/javascript"></script>
<script src="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/js/cj-top-right-buttons.min.js?v=1" type="text/javascript"></script>
<script src="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/js/cj-music-player.min.js?v=1" type="text/javascript"></script>
<script src="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/js/cj-contact-form.min.js?v=1" type="text/javascript"></script>
<script src="/resources/gilfillanPhotoAssets/bower_components/galleryjack_rebooted/js/cj-html-video.min.js?v=1" type="text/javascript"></script>

<!--jQuery OWL Carousel-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/bower_components/owl.carousel.2.0.0/owl.carousel.min.js"></script>

<!--jQuery Megafolio-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/bower_components/megafolio/js/jquery.themepunch.tools.min.js"></script>
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/bower_components/megafolio/js/jquery.themepunch.megafoliopro.js"></script>

<!--jQuery FancyBox-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/bower_components/fancybox/jquery.fancybox.pack.js?v=2.1.5"></script>

<!--jQuery Isotope-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/isotope.pkgd.min.js"></script>

<!--jQuery Imageloaded-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/imagesloaded.pkgd.min.js"></script>

<!--jQuery FlexSlider-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/bower_components/FlexSlider/jquery.flexslider.js"></script>

<!--jQuery Fullpage-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/jquery.fullPage.min.js"></script>

<!--jQuery Tooltips-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/bower_components/tooltipster/js/jquery.tooltipster.min.js"></script>

<!--Placeholder js file-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/placeholder.js"></script>

<!--Custom js file-->
<script type="text/javascript" src="/resources/gilfillanPhotoAssets/js/custom.js"></script>

</body>
</html>
