

**User Study #1: Prototype**

- User 1:
A psychology major student who has no prior programming experience. He does not know how to set up his own website.
We gave him the idea of how our project should look like. Different types of themes that he is able to choose and type in input. The whole webpage has rows of images for items that can show to people who visit.
After giving him the idea, we asked some questions for feedback.

- User 2:
A fourth year CS student that has worked on some projects related to JAVA, JS, and HTML. Has no experience in DSL, but is very interested in how it works to make a new language for people to use.
We didn’t elaborate on how DSL works, but showed him how it is possible for someone to code in the inputs to get a result that is somehow similar to doing actual programming. He knows about the basic format for the websites and gives feedback by the following questions that we ask.


- Questions asked for feedback:
  1. Does the user understand or is it easy to understand our DSL language?
  2. Does the current features satisfy the users’ needs?
  3. What should be improved or are there any other suggestions?


- Prototype user study feedback:
  1. User #1 (Non CS student):
  - The idea of the DSL is simple to understand.
  - The current ideas for the features are great, however, it is better to add a few more. Adding a search text box can easily search the images that I want to find. And also, if I want to sell my art, it is better to add price and contact information so that people could reach out to me.
  - I think the project is a great start if I want to learn other programming languages in the future. A great chance for me if I want to learn JAVA.
  2. User #2 (CS student):
  - The idea of the project is interesting. I don’t have much knowledge in DLS, but compared with some platforms that only have a simple interface to set up a website that gives only templates, it is much more flexible to design a website that someone would like in their thoughts. This simple language really can help people to be more creative.
  - The current design is quite simple. Since there are multiple sections, adding a feature that allows users to jump between sections would be better than scrolling. Also making it with more pages that displays and restricts the total number displays on each page will be clean to manage and display to others.
  - Overall the project is interesting and well-designed for anyone that has no knowledge in programming. It is also a great starter to learn some basic programming if someone wants to learn more about JAVA and to combine it with HTML, CSS (which is pretty easy to learn in my opinion). I already know how to use JAVA, but it is great to get started if someone wants to do more in the future. I would like to try out this project when it is implemented and see the experience.


- What we changed or added after the user study feedback:
  1. Added price for each item that is now clear for someone who visits the website and interested in the art or item.
  2. Added footer for displaying contact information
  3. Instead of adding a search bar, we figured out a navbar that has options for searching to click on will be clear and easier to use.

**User Study #2**

- Background:
We showed the users a sample input file and the generated output page. Then, we asked them to create a web page using our DSL with their own choice of items and pictures that they downloaded and put into folders. After the task got completed, we asked for feedback.


- User study feedback after implementation:
  1. User #1 (non CS student):
  - The current version of the language has more features. It is simple to input and get the results that I need.
  - The navbar that has sections to click on is simple to find the section that I want to find. Adding the price makes it more clear for people who visit to know how much it cost for a set of images or products. Also the contact info at the bottom is clear for anyone who is interested and wants to reach out to me.
  - The image layout looks great, but I would recommend one of the images is larger and when clicking other images than the larger one, the ones that are clicked can be larger and the previous enlarged image become smaller.
  - The ROW option is not very necessary given the layout of the current themes because one item per row fits the best and looks better, otherwise it will look too crowded.
  2. User #2 (CS student):
  - There are lots of improvements after the prototype study. Increasing options to input and have more features makes it more flexible for users to make the website richer. The language is still simple to use even after adding more features.
  - The navbar is the most attractive feature for me because it has sections that I can click and it quickly jumps to the section and easier to find the products that I want to find. This is something like a search bar, but making it into buttons and giving options in the navbar is somehow an easier way instead of searching with text. Because people might not know what items this website sells and it will be hard to search for specific items. So I’d say the navbar is a good option. But there is one problem with the navigation bar which will disappear while scrolling down the webpage. This makes it inconvenient when I have to scroll back to the top, so I recommend sticking the bar at the top. The images shown in each item has the first one larger and clicking on other ones makes them swap with first one is an interesting way to give better view of the images, however, I would prefer it to be like the images in products shown the way such as amazon. But this design still gives better view so I think it is a good project.
  - Overall everything has improved a lot, still a good starter for anyone who doesn’t know anything about programming. Features that this project have are simple, but I think it will be great if there are other things to improve, maybe more options for the input and making it be more like a real language so that it can be more flexible if I want to add a feature or not and have the option to make the website close to the users’ thoughts.


- Changes after the feedback from Implementation:
  - Removed the ROW keyword in DSL and only allowed one item per row.
  - The images for one item are laid out in a display area where it has a larger grid area for the main image and smaller grid areas for other equivalent images. Users are able to switch images in the small grid to the large grid for a better viewing experience with one simple click.)
  - Modified the navigation bar and made it stick at the top of the webpage.
  - Added an error page for displaying the messages so that it makes it easier for users to understand the error and know what to change for the input accordingly. The output html will show an error page if the user enters some inputs that are not following the language instruction/syntax.

