\* Copyright (c) 28-03-12,  Willi O Riha
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met: 

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer. 
2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution. 

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*\

(datatype ustring

   if (ustring? S)
   _______________		\* definition *\
   S : ustring;  
 
   S : ustring;
   ____________			\* subtype! *\
   S : string; 
   
   __________________________________		\* alternative signature *\
   n->string : (number --> ustring); 

   ____________________________________	    \* alternative signature *\
   pos : (string --> number --> ustring); 
      
   ____________________________				\* alternative signature *\
   hdstr : (string --> ustring);
  
   F : (ustring --> ustring);
   __________________________				\* type checker needs to be told *\
   F : (ustring --> string); 
   
   S : ustring, Str : string >> P; 
   _______________________________			\* rule for @s *\
   (@s S Str) : string >> P;

   ______________________________________	\* ustring is a 'verified type' *\
   (ustring? S): verified >> S : ustring;
) 