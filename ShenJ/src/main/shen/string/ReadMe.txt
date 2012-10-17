String Library (v.3 04-07-12)
==============

1. This version does not use a data type 'integer'.
   It was found that there is no need for it, as most of the functions,
   when called with non-integer arguments, will produce meaningful results.
   Error messages have been added, where this would not be the case.
   See documentation in file 'String Library' (availabe in Word, pdf and MHTML format).

2. A new function, string->number, has been added, which is intended to convert
   a string, representing a Shen number, to a number.

3. The new version is now compatible with the Maths Library.

4. How to load the string library				

	(load "s-lib.shen")
					
   Before using any of the functions, even if you are familar with their names,
   please, read the documentation in "String Library".

W O Riha
