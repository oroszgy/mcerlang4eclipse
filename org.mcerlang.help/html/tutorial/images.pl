# LaTeX2HTML 2008 (1.71)
# Associate images original text with physical files.


$key = q/mathit{P};mathit{until};mathit{Q};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="72" HEIGHT="30" ALIGN="MIDDLE" BORDER="0"
 SRC="|."$dir".q|img4.png"
 ALT="$\mathit{P}\;\mathit{until}\;\mathit{Q}$">|; 

$key = q/mathit{P};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="16" HEIGHT="14" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img1.png"
 ALT="$\mathit{P}$">|; 

$key = q/Rightarrow;MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="20" HEIGHT="17" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img6.png"
 ALT="$\Rightarrow$">|; 

$key = q/mathit{T};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="17" HEIGHT="14" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img13.png"
 ALT="$\mathit{T}$">|; 

$key = q/{lstlisting}server_logon(From,Name,User_List)-><comment_mark>caselists:keymemberce_erl:probe_state({logged_on,Name}),[{From,Name}|User_List]end.{lstlisting};AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="415" HEIGHT="221" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img9.png"
 ALT="\begin{lstlisting}
server_logon(From, Name, User_List) -&gt;
%
case lists:keymembe...
...e_state({logged_on,Name}),
[{From, Name}\vert User_List]
end.
\end{lstlisting}">|; 

$key = q/mathit{notQ};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="40" HEIGHT="30" ALIGN="MIDDLE" BORDER="0"
 SRC="|."$dir".q|img14.png"
 ALT="$\mathit{not Q}$">|; 

$key = q/{lstlisting}logged_on(Name)->fun(State,_,_)->mce_erl:has_probe_state({logged_on,Name},State)end.{lstlisting};AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="282" HEIGHT="87" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img11.png"
 ALT="\begin{lstlisting}
logged_on(Name) -&gt;
fun (State,_,_) -&gt;
mce_erl:has_probe_state
({logged_on,Name},State)
end.
\end{lstlisting}">|; 

$key = q/mathit{Q};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="17" HEIGHT="30" ALIGN="MIDDLE" BORDER="0"
 SRC="|."$dir".q|img2.png"
 ALT="$\mathit{Q}$">|; 

$key = q/mathit{eventually};mathit{R};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="91" HEIGHT="30" ALIGN="MIDDLE" BORDER="0"
 SRC="|."$dir".q|img5.png"
 ALT="$\mathit{eventually}\;\mathit{R}$">|; 

$key = q/mathit{R};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="16" HEIGHT="14" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img3.png"
 ALT="$\mathit{R}$">|; 

$key = q/mathit{always};MSF=1.6;AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="50" HEIGHT="30" ALIGN="MIDDLE" BORDER="0"
 SRC="|."$dir".q|img12.png"
 ALT="$\mathit{always}$">|; 

$key = q/{lstlisting}client(Server_Node,Name)->{messenger,Server_Node}!{self(),logon,Name},await_result(),mce_erl:probe(logon,Name),client(Server_Node).{lstlisting};AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="433" HEIGHT="90" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img7.png"
 ALT="\begin{lstlisting}
client(Server_Node, Name) -&gt;
{messenger,Server_Node}!{self(...
...it_result(),
mce_erl:probe(logon,Name),
client(Server_Node).
\end{lstlisting}">|; 

$key = q/{lstlisting}server_logoff(From,User_List)->caselists:keysearch(From,1,User_List)logged_on,Name});false->okend,lists:keydelete(From,1,User_List).{lstlisting};AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="406" HEIGHT="168" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img10.png"
 ALT="\begin{lstlisting}
server_logoff(From,User_List) -&gt;
case lists:keysearch(From,1...
...ame});
false -&gt;
ok
end,
lists:keydelete(From,1,User_List).
\end{lstlisting}">|; 

$key = q/{lstlisting}logon(Name)->fun(_,Actions,_)->lists:any(fun(Action)->trylogon=mce_ens:get_probe_term(Action),truecatch_:_->falseendend,Actions)end.{lstlisting};AAT/;
$cached_env_img{$key} = q|<IMG
 WIDTH="348" HEIGHT="278" ALIGN="BOTTOM" BORDER="0"
 SRC="|."$dir".q|img8.png"
 ALT="\begin{lstlisting}
logon(Name) -&gt;
fun (_,Actions,_) -&gt;
lists:any
(fun (Action...
...erm(Action),
true
catch _:_ -&gt; false end
end, Actions)
end.
\end{lstlisting}">|; 

1;

