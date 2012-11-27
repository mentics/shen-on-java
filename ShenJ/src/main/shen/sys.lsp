(DEFUN shell-with-file (Command File)
       (EXT:RUN-PROGRAM Command :WAIT T :INDIRECTP T :OUTPUT File)
          (LET ((Output (read-file-as-string File)))
               (DELETE-FILE File)
               Output))

(DEFUN shell-stream (Command)
  (EXT:RUN-PROGRAM Command :WAIT T :INDIRECTP T :OUTPUT :STREAM))

(DEFUN make-directories (Directory)
  (ENSURE-DIRECTORIES-EXIST Directory))