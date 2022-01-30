#ordering elements with their reference page
import re
inp="background-attachment property 414 background-color 250 background-image property 413 background-image property (gradients) 419 background-position property 415 background property 416 background-repeat property 414 border-bottom-color 311 border-bottom-style 310 border-collapse property 340 border-color 311 border-image property 319 border-left-color 311 border-left-style 310 border property 312 border-radius property 321 border-right-color 311 border-right-style 310 border-spacing property 340 border-style 310 border-top-color 311 border-top-style 310 bottom property 366–371 box-shadow property 320 clear property 372 color 249 cursor property 347 display property 317 empty-cells property 339 float property 364, 370–375 float property (images) 411 @font-face 277 font-face 271 font-family 271, 273 font-size 274, 276 font-style property 280 height (images) 409–410 hsl / hsla 255–256 left property 366–371 letter-spacing 284 line-height 283 list-style-image property 334 list-style-position property 335 list-style property 336 list-style-type property 333 margin-bottom property 314 margin-left property 314 margin property 314 margin-right property 314 margin-top property 314 opacity 254 padding-bottom property 313 padding-left property 313 padding property 313 padding property (tables) 337 padding-right property 313 padding-top property 313 position property 366, 367 rgba 254 right property 366–371 text-align 285 text-decoration 282 text-indent 287 text-shadow 288 text-transform 281 top property 366–371 vertical-align 286 visibility property 318 width (images) 409–410 width property (floating elements) 371 width property (tables) 337 word-spacing 284 z-index property 364, 369"
def getnum(m):
    x=1
    a=""
    m-=2
    while inp[m+x].isdigit():
        a+=inp[m+x]
        x+=1
    return a,x
def dicta():
    out={}
    l=0
    i=1
    while i +3 < len(inp):
        if (inp[i].isdigit()):
            out[inp[l:i]]=getnum(i+1)[0]
            i+=getnum(i+1)[1]
            l=i
        i+=1
    return out
def fil():
    x=dicta()
    for i in dicta().keys():
        if i.isdigit():
            del x[i]

    return x
x=fil()
x={k: v for k, v in sorted(x.items(), key=lambda item: item[1])}
for i in x.keys():
    print(i)
