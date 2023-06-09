<!DOCTYPE html>
<html>
  <head>
    <title>Bounty | Index</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="stylex.css">
    <style>
      
      .landingPage{height:100vh;background:var(--col3);padding:0 2.2em;}
      .landNavbar{padding:1em 0;}
      .landMainTitleCrate{font-size:26px;letter-spacing:.1em;}
      .landSingleLink{font-size:18px;text-decoration: none;color:var(--col1);margin:0 30px;}
      .landSingleLink:hover{text-decoration: underline;transition:.3s;}


      .landImageSloth{overflow: hidden;}
      .landTextContentCrate{padding:0 100px;}
      .landTextSloth{font-size:18px;line-height:34px;}
      .landButtonCrate{padding-top:14px;}
      .landButtonSignIn{font-size:20px;padding:7px 25px;border-radius:4px;background:var(--col1);color:var(--col4);
        border:1px solid var(--col1);cursor: pointer;}
      .landButtonSignIn:hover {background:var(--col3);color:var(--col1);transition:.3s;}
    </style>
  </head>
  <body>
    <div class="landingPage bor">
      <div class="inrLandingPage bor hw100 flex fdc">
        <div class="landNavbar bor flex jcsb">
          <a href="index.jsp" class="landMainTitleCrate ff1 totext">
            BOUNTY
          </a>
          <div class="landMainLinkCrate flex jcfe ff1">
            <a href="#" class="landSingleLink bor flexmid">Customer</a>
            <a href="#" class="landSingleLink bor flexmid">Solution</a>
            <a href="#" class="landSingleLink bor flexmid">About Us</a>
            <a href="signup.jsp" class="landSingleLink bor flexmid">Sign Up</a>
          </div>
        </div>
        <div class="landContentCrate fg1 bor">
          <div class="inrLandContentCrate bor h100 flex">
            <div class="landImageCrate w50 bor flexmid p10">

              <div class="landImageSloth bor flex">
                <img src="image/background.png" alt="" class="landImageImg w100 bor">
              </div>
              
            </div>
            <div class="landTextContentCrate w50 bor flex fdc jcc ">
              <div class="landTextSloth bor ff1">
                Bounty is a way for companies to acknowledge and appreciate the contributions of their employees through tangible or intangible incentives, which helps to increase employee motivation, job satisfaction, and loyalty.
              </div>
              <div class="landButtonCrate bor flex">
                <a href="signin.jsp" class="landButtonSloth landButtonSignIn borx ff1 totext">
                  Sign In
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script src="js1/script1.js"></script>
    <script>
      //var mainbody = document.querySelector(".mainbody");
      //var inrgmblock = document.querySelectorAll(".inrgmblock");
      function ppp(){
        var b = ".h100{height:100%}";
        var a,a1,a2,a3,a4;
        for(a=5;a<=100;a+=5){
          a1 = ".w"
          a2 = "{width:"
          a3 = "%;}"
          console.log(a1 + a + a2 + a + a3);
        }
      }
    </script>
  </body>
</html>
