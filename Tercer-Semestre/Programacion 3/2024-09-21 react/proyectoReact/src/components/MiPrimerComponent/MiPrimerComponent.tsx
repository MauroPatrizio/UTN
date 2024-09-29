import { FC } from "react";

interface IPropsMiPrimerComponente{
    text:string;
    color:string;
    fontSize?:number;
}

export const MiPrimerComponent : FC<IPropsMiPrimerComponente> = ({
    text,
    color,
    fontSize
}) => {
  return (
    <div style={{color:`${color}`, fontSize: `${fontSize || 10}rem`}}><p>{text}</p></div>
  )
}
