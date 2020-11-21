package com.pigsun.github;

import com.pigsun.github.adapters.SquarePegAdapter;
import com.pigsun.github.hole.RoundHole;
import com.pigsun.github.peg.RoundPeg;
import com.pigsun.github.peg.SquarePeg;

/**
 * @author pigsun
 */
public class Demo {

    public static void main(String[] args) {
        //圆孔
        RoundHole roundHole = new RoundHole(5);
        //圆钉
        RoundPeg roundPeg = new RoundPeg(5);

        if(roundHole.fits(roundPeg)){
            System.out.println("圆钉半径:"+roundPeg.getRadius()+"放入到了圆孔半径："+roundHole.getRadius());
        }

        SquarePeg smallPeg = new SquarePeg(5);
        SquarePeg largePeg = new SquarePeg(20);

        //定义两个适配器
        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largePeg);

        if(roundHole.fits(smallAdapter)){
            System.out.println("方钉半径5的放入到了圆孔半径5");
        }

        if(roundHole.fits(largeAdapter)){
            System.out.println("方钉半径20放入到了圆孔半径5");
        }
    }
}
