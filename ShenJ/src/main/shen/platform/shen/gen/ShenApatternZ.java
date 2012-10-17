package shen.gen;



import com.mentics.shen.*;

public class ShenApatternZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<pattern>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v404) throws Exception {
return defined(v404);
}};
public static Object defined(final Object v404) throws Exception {
final Object f1551 = Fst.LAMBDA.apply(v404);


final Object i1554;
if ((boolean)(f1551 instanceof Cons)) {
final Object f1552 = Fst.LAMBDA.apply(v404);



final Object i1553;
if ((boolean)(((Cons)f1552).head instanceof Cons)) {

i1553 = true;
} else {

i1553 = false;

}
i1554 = i1553;
} else {

i1554 = false;

}
final Object i1591;
if ((boolean)i1554) {
final Object f1555 = Fst.LAMBDA.apply(v404);

final Object f1556 = Snd.LAMBDA.apply(v404);
final Object f1557 = ShenReassemble.LAMBDA.apply(((Cons)f1555).head, f1556);
final Object f1558 = Fst.LAMBDA.apply(f1557);


final Object i1564;
if ((boolean)(f1558 instanceof Cons)) {
final Object f1559 = Fst.LAMBDA.apply(v404);

final Object f1560 = Snd.LAMBDA.apply(v404);
final Object f1561 = ShenReassemble.LAMBDA.apply(((Cons)f1559).head, f1560);
final Object f1562 = Fst.LAMBDA.apply(f1561);


final Object i1563;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), ((Cons)f1562).head)) {

i1563 = true;
} else {

i1563 = false;

}
i1564 = i1563;
} else {

i1564 = false;

}
final Object i1589;
if ((boolean)i1564) {
final Object f1566 = Fst.LAMBDA.apply(v404);

final Object f1567 = Snd.LAMBDA.apply(v404);
final Object f1568 = ShenReassemble.LAMBDA.apply(((Cons)f1566).head, f1567);
final Object f1569 = Fst.LAMBDA.apply(f1568);

final Object f1570 = Fst.LAMBDA.apply(v404);

final Object f1571 = Snd.LAMBDA.apply(v404);
final Object f1572 = ShenReassemble.LAMBDA.apply(((Cons)f1570).head, f1571);
final Object f1573 = Snd.LAMBDA.apply(f1572);
final Object f1574 = ShenReassemble.LAMBDA.apply(((Cons)f1569).tail, f1573);
final Object f1575 = ShenApattern1Z.LAMBDA.apply(f1574);

final Object parse_Apattern1Z1565 = f1575;


final Object i1588;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern1Z1565))) {
final Object f1577 = ShenApattern2Z.LAMBDA.apply(parse_Apattern1Z1565);

final Object parse_Apattern2Z1576 = f1577;


final Object i1587;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern2Z1576))) {
final Object f1578 = Fst.LAMBDA.apply(parse_Apattern2Z1576);
final Object f1579 = Fst.LAMBDA.apply(v404);

final Object f1580 = Snd.LAMBDA.apply(v404);
final Object f1581 = ShenReassemble.LAMBDA.apply(((Cons)f1579).tail, f1580);
final Object f1582 = Fst.LAMBDA.apply(f1581);

final Object f1583 = Snd.LAMBDA.apply(parse_Apattern1Z1565);

final Object f1584 = Snd.LAMBDA.apply(parse_Apattern2Z1576);




final Object f1585 = ShenReassemble.LAMBDA.apply(f1582, new Cons(RuntimeContext.symbol("@p"), new Cons(f1583, new Cons(f1584, Nil.NIL))));
final Object f1586 = ShenReassemble.LAMBDA.apply(f1578, f1585);

i1587 = f1586;
} else {

i1587 = null;

}

i1588 = i1587;
} else {

i1588 = null;

}

i1589 = i1588;
} else {

i1589 = null;

}final Object f1590 = ShenSndOrFail.LAMBDA.apply(i1589);

i1591 = f1590;
} else {

i1591 = null;

}
final Object result1550 = i1591;

final Object i1813;
if ((boolean)Lang.equals(result1550, null)) {
final Object f1593 = Fst.LAMBDA.apply(v404);


final Object i1596;
if ((boolean)(f1593 instanceof Cons)) {
final Object f1594 = Fst.LAMBDA.apply(v404);



final Object i1595;
if ((boolean)(((Cons)f1594).head instanceof Cons)) {

i1595 = true;
} else {

i1595 = false;

}
i1596 = i1595;
} else {

i1596 = false;

}
final Object i1633;
if ((boolean)i1596) {
final Object f1597 = Fst.LAMBDA.apply(v404);

final Object f1598 = Snd.LAMBDA.apply(v404);
final Object f1599 = ShenReassemble.LAMBDA.apply(((Cons)f1597).head, f1598);
final Object f1600 = Fst.LAMBDA.apply(f1599);


final Object i1606;
if ((boolean)(f1600 instanceof Cons)) {
final Object f1601 = Fst.LAMBDA.apply(v404);

final Object f1602 = Snd.LAMBDA.apply(v404);
final Object f1603 = ShenReassemble.LAMBDA.apply(((Cons)f1601).head, f1602);
final Object f1604 = Fst.LAMBDA.apply(f1603);


final Object i1605;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)f1604).head)) {

i1605 = true;
} else {

i1605 = false;

}
i1606 = i1605;
} else {

i1606 = false;

}
final Object i1631;
if ((boolean)i1606) {
final Object f1608 = Fst.LAMBDA.apply(v404);

final Object f1609 = Snd.LAMBDA.apply(v404);
final Object f1610 = ShenReassemble.LAMBDA.apply(((Cons)f1608).head, f1609);
final Object f1611 = Fst.LAMBDA.apply(f1610);

final Object f1612 = Fst.LAMBDA.apply(v404);

final Object f1613 = Snd.LAMBDA.apply(v404);
final Object f1614 = ShenReassemble.LAMBDA.apply(((Cons)f1612).head, f1613);
final Object f1615 = Snd.LAMBDA.apply(f1614);
final Object f1616 = ShenReassemble.LAMBDA.apply(((Cons)f1611).tail, f1615);
final Object f1617 = ShenApattern1Z.LAMBDA.apply(f1616);

final Object parse_Apattern1Z1607 = f1617;


final Object i1630;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern1Z1607))) {
final Object f1619 = ShenApattern2Z.LAMBDA.apply(parse_Apattern1Z1607);

final Object parse_Apattern2Z1618 = f1619;


final Object i1629;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern2Z1618))) {
final Object f1620 = Fst.LAMBDA.apply(parse_Apattern2Z1618);
final Object f1621 = Fst.LAMBDA.apply(v404);

final Object f1622 = Snd.LAMBDA.apply(v404);
final Object f1623 = ShenReassemble.LAMBDA.apply(((Cons)f1621).tail, f1622);
final Object f1624 = Fst.LAMBDA.apply(f1623);

final Object f1625 = Snd.LAMBDA.apply(parse_Apattern1Z1607);

final Object f1626 = Snd.LAMBDA.apply(parse_Apattern2Z1618);




final Object f1627 = ShenReassemble.LAMBDA.apply(f1624, new Cons(RuntimeContext.symbol("cons"), new Cons(f1625, new Cons(f1626, Nil.NIL))));
final Object f1628 = ShenReassemble.LAMBDA.apply(f1620, f1627);

i1629 = f1628;
} else {

i1629 = null;

}

i1630 = i1629;
} else {

i1630 = null;

}

i1631 = i1630;
} else {

i1631 = null;

}final Object f1632 = ShenSndOrFail.LAMBDA.apply(i1631);

i1633 = f1632;
} else {

i1633 = null;

}
final Object result1592 = i1633;

final Object i1812;
if ((boolean)Lang.equals(result1592, null)) {
final Object f1635 = Fst.LAMBDA.apply(v404);


final Object i1638;
if ((boolean)(f1635 instanceof Cons)) {
final Object f1636 = Fst.LAMBDA.apply(v404);



final Object i1637;
if ((boolean)(((Cons)f1636).head instanceof Cons)) {

i1637 = true;
} else {

i1637 = false;

}
i1638 = i1637;
} else {

i1638 = false;

}
final Object i1675;
if ((boolean)i1638) {
final Object f1639 = Fst.LAMBDA.apply(v404);

final Object f1640 = Snd.LAMBDA.apply(v404);
final Object f1641 = ShenReassemble.LAMBDA.apply(((Cons)f1639).head, f1640);
final Object f1642 = Fst.LAMBDA.apply(f1641);


final Object i1648;
if ((boolean)(f1642 instanceof Cons)) {
final Object f1643 = Fst.LAMBDA.apply(v404);

final Object f1644 = Snd.LAMBDA.apply(v404);
final Object f1645 = ShenReassemble.LAMBDA.apply(((Cons)f1643).head, f1644);
final Object f1646 = Fst.LAMBDA.apply(f1645);


final Object i1647;
if ((boolean)Lang.equals(RuntimeContext.symbol("@v"), ((Cons)f1646).head)) {

i1647 = true;
} else {

i1647 = false;

}
i1648 = i1647;
} else {

i1648 = false;

}
final Object i1673;
if ((boolean)i1648) {
final Object f1650 = Fst.LAMBDA.apply(v404);

final Object f1651 = Snd.LAMBDA.apply(v404);
final Object f1652 = ShenReassemble.LAMBDA.apply(((Cons)f1650).head, f1651);
final Object f1653 = Fst.LAMBDA.apply(f1652);

final Object f1654 = Fst.LAMBDA.apply(v404);

final Object f1655 = Snd.LAMBDA.apply(v404);
final Object f1656 = ShenReassemble.LAMBDA.apply(((Cons)f1654).head, f1655);
final Object f1657 = Snd.LAMBDA.apply(f1656);
final Object f1658 = ShenReassemble.LAMBDA.apply(((Cons)f1653).tail, f1657);
final Object f1659 = ShenApattern1Z.LAMBDA.apply(f1658);

final Object parse_Apattern1Z1649 = f1659;


final Object i1672;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern1Z1649))) {
final Object f1661 = ShenApattern2Z.LAMBDA.apply(parse_Apattern1Z1649);

final Object parse_Apattern2Z1660 = f1661;


final Object i1671;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern2Z1660))) {
final Object f1662 = Fst.LAMBDA.apply(parse_Apattern2Z1660);
final Object f1663 = Fst.LAMBDA.apply(v404);

final Object f1664 = Snd.LAMBDA.apply(v404);
final Object f1665 = ShenReassemble.LAMBDA.apply(((Cons)f1663).tail, f1664);
final Object f1666 = Fst.LAMBDA.apply(f1665);

final Object f1667 = Snd.LAMBDA.apply(parse_Apattern1Z1649);

final Object f1668 = Snd.LAMBDA.apply(parse_Apattern2Z1660);




final Object f1669 = ShenReassemble.LAMBDA.apply(f1666, new Cons(RuntimeContext.symbol("@v"), new Cons(f1667, new Cons(f1668, Nil.NIL))));
final Object f1670 = ShenReassemble.LAMBDA.apply(f1662, f1669);

i1671 = f1670;
} else {

i1671 = null;

}

i1672 = i1671;
} else {

i1672 = null;

}

i1673 = i1672;
} else {

i1673 = null;

}final Object f1674 = ShenSndOrFail.LAMBDA.apply(i1673);

i1675 = f1674;
} else {

i1675 = null;

}
final Object result1634 = i1675;

final Object i1811;
if ((boolean)Lang.equals(result1634, null)) {
final Object f1677 = Fst.LAMBDA.apply(v404);


final Object i1680;
if ((boolean)(f1677 instanceof Cons)) {
final Object f1678 = Fst.LAMBDA.apply(v404);



final Object i1679;
if ((boolean)(((Cons)f1678).head instanceof Cons)) {

i1679 = true;
} else {

i1679 = false;

}
i1680 = i1679;
} else {

i1680 = false;

}
final Object i1717;
if ((boolean)i1680) {
final Object f1681 = Fst.LAMBDA.apply(v404);

final Object f1682 = Snd.LAMBDA.apply(v404);
final Object f1683 = ShenReassemble.LAMBDA.apply(((Cons)f1681).head, f1682);
final Object f1684 = Fst.LAMBDA.apply(f1683);


final Object i1690;
if ((boolean)(f1684 instanceof Cons)) {
final Object f1685 = Fst.LAMBDA.apply(v404);

final Object f1686 = Snd.LAMBDA.apply(v404);
final Object f1687 = ShenReassemble.LAMBDA.apply(((Cons)f1685).head, f1686);
final Object f1688 = Fst.LAMBDA.apply(f1687);


final Object i1689;
if ((boolean)Lang.equals(RuntimeContext.symbol("@s"), ((Cons)f1688).head)) {

i1689 = true;
} else {

i1689 = false;

}
i1690 = i1689;
} else {

i1690 = false;

}
final Object i1715;
if ((boolean)i1690) {
final Object f1692 = Fst.LAMBDA.apply(v404);

final Object f1693 = Snd.LAMBDA.apply(v404);
final Object f1694 = ShenReassemble.LAMBDA.apply(((Cons)f1692).head, f1693);
final Object f1695 = Fst.LAMBDA.apply(f1694);

final Object f1696 = Fst.LAMBDA.apply(v404);

final Object f1697 = Snd.LAMBDA.apply(v404);
final Object f1698 = ShenReassemble.LAMBDA.apply(((Cons)f1696).head, f1697);
final Object f1699 = Snd.LAMBDA.apply(f1698);
final Object f1700 = ShenReassemble.LAMBDA.apply(((Cons)f1695).tail, f1699);
final Object f1701 = ShenApattern1Z.LAMBDA.apply(f1700);

final Object parse_Apattern1Z1691 = f1701;


final Object i1714;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern1Z1691))) {
final Object f1703 = ShenApattern2Z.LAMBDA.apply(parse_Apattern1Z1691);

final Object parse_Apattern2Z1702 = f1703;


final Object i1713;
if ((boolean)!((boolean)Lang.equals(null, parse_Apattern2Z1702))) {
final Object f1704 = Fst.LAMBDA.apply(parse_Apattern2Z1702);
final Object f1705 = Fst.LAMBDA.apply(v404);

final Object f1706 = Snd.LAMBDA.apply(v404);
final Object f1707 = ShenReassemble.LAMBDA.apply(((Cons)f1705).tail, f1706);
final Object f1708 = Fst.LAMBDA.apply(f1707);

final Object f1709 = Snd.LAMBDA.apply(parse_Apattern1Z1691);

final Object f1710 = Snd.LAMBDA.apply(parse_Apattern2Z1702);




final Object f1711 = ShenReassemble.LAMBDA.apply(f1708, new Cons(RuntimeContext.symbol("@s"), new Cons(f1709, new Cons(f1710, Nil.NIL))));
final Object f1712 = ShenReassemble.LAMBDA.apply(f1704, f1711);

i1713 = f1712;
} else {

i1713 = null;

}

i1714 = i1713;
} else {

i1714 = null;

}

i1715 = i1714;
} else {

i1715 = null;

}final Object f1716 = ShenSndOrFail.LAMBDA.apply(i1715);

i1717 = f1716;
} else {

i1717 = null;

}
final Object result1676 = i1717;

final Object i1810;
if ((boolean)Lang.equals(result1676, null)) {
final Object f1719 = Fst.LAMBDA.apply(v404);


final Object i1722;
if ((boolean)(f1719 instanceof Cons)) {
final Object f1720 = Fst.LAMBDA.apply(v404);



final Object i1721;
if ((boolean)(((Cons)f1720).head instanceof Cons)) {

i1721 = true;
} else {

i1721 = false;

}
i1722 = i1721;
} else {

i1722 = false;

}
final Object i1786;
if ((boolean)i1722) {
final Object f1723 = Fst.LAMBDA.apply(v404);

final Object f1724 = Snd.LAMBDA.apply(v404);
final Object f1725 = ShenReassemble.LAMBDA.apply(((Cons)f1723).head, f1724);
final Object f1726 = Fst.LAMBDA.apply(f1725);


final Object i1732;
if ((boolean)(f1726 instanceof Cons)) {
final Object f1727 = Fst.LAMBDA.apply(v404);

final Object f1728 = Snd.LAMBDA.apply(v404);
final Object f1729 = ShenReassemble.LAMBDA.apply(((Cons)f1727).head, f1728);
final Object f1730 = Fst.LAMBDA.apply(f1729);


final Object i1731;
if ((boolean)Lang.equals(RuntimeContext.symbol("vector"), ((Cons)f1730).head)) {

i1731 = true;
} else {

i1731 = false;

}
i1732 = i1731;
} else {

i1732 = false;

}
final Object i1784;
if ((boolean)i1732) {
final Object f1733 = Fst.LAMBDA.apply(v404);

final Object f1734 = Snd.LAMBDA.apply(v404);
final Object f1735 = ShenReassemble.LAMBDA.apply(((Cons)f1733).head, f1734);
final Object f1736 = Fst.LAMBDA.apply(f1735);

final Object f1737 = Fst.LAMBDA.apply(v404);

final Object f1738 = Snd.LAMBDA.apply(v404);
final Object f1739 = ShenReassemble.LAMBDA.apply(((Cons)f1737).head, f1738);
final Object f1740 = Snd.LAMBDA.apply(f1739);
final Object f1741 = ShenReassemble.LAMBDA.apply(((Cons)f1736).tail, f1740);
final Object f1742 = Fst.LAMBDA.apply(f1741);


final Object i1754;
if ((boolean)(f1742 instanceof Cons)) {
final Object f1743 = Fst.LAMBDA.apply(v404);

final Object f1744 = Snd.LAMBDA.apply(v404);
final Object f1745 = ShenReassemble.LAMBDA.apply(((Cons)f1743).head, f1744);
final Object f1746 = Fst.LAMBDA.apply(f1745);

final Object f1747 = Fst.LAMBDA.apply(v404);

final Object f1748 = Snd.LAMBDA.apply(v404);
final Object f1749 = ShenReassemble.LAMBDA.apply(((Cons)f1747).head, f1748);
final Object f1750 = Snd.LAMBDA.apply(f1749);
final Object f1751 = ShenReassemble.LAMBDA.apply(((Cons)f1746).tail, f1750);
final Object f1752 = Fst.LAMBDA.apply(f1751);


final Object i1753;
if ((boolean)Lang.equals(0, ((Cons)f1752).head)) {

i1753 = true;
} else {

i1753 = false;

}
i1754 = i1753;
} else {

i1754 = false;

}
final Object i1783;
if ((boolean)i1754) {
final Object f1755 = Fst.LAMBDA.apply(v404);

final Object f1756 = Snd.LAMBDA.apply(v404);
final Object f1757 = ShenReassemble.LAMBDA.apply(((Cons)f1755).head, f1756);
final Object f1758 = Fst.LAMBDA.apply(f1757);

final Object f1759 = Fst.LAMBDA.apply(v404);

final Object f1760 = Snd.LAMBDA.apply(v404);
final Object f1761 = ShenReassemble.LAMBDA.apply(((Cons)f1759).head, f1760);
final Object f1762 = Snd.LAMBDA.apply(f1761);
final Object f1763 = ShenReassemble.LAMBDA.apply(((Cons)f1758).tail, f1762);
final Object f1764 = Fst.LAMBDA.apply(f1763);

final Object f1765 = Fst.LAMBDA.apply(v404);

final Object f1766 = Snd.LAMBDA.apply(v404);
final Object f1767 = ShenReassemble.LAMBDA.apply(((Cons)f1765).head, f1766);
final Object f1768 = Fst.LAMBDA.apply(f1767);

final Object f1769 = Fst.LAMBDA.apply(v404);

final Object f1770 = Snd.LAMBDA.apply(v404);
final Object f1771 = ShenReassemble.LAMBDA.apply(((Cons)f1769).head, f1770);
final Object f1772 = Snd.LAMBDA.apply(f1771);
final Object f1773 = ShenReassemble.LAMBDA.apply(((Cons)f1768).tail, f1772);
final Object f1774 = Snd.LAMBDA.apply(f1773);
final Object f1775 = ShenReassemble.LAMBDA.apply(((Cons)f1764).tail, f1774);
final Object f1776 = Fst.LAMBDA.apply(f1775);
final Object f1777 = Fst.LAMBDA.apply(v404);

final Object f1778 = Snd.LAMBDA.apply(v404);
final Object f1779 = ShenReassemble.LAMBDA.apply(((Cons)f1777).tail, f1778);
final Object f1780 = Fst.LAMBDA.apply(f1779);




final Object f1781 = ShenReassemble.LAMBDA.apply(f1780, new Cons(RuntimeContext.symbol("vector"), new Cons(0, Nil.NIL)));
final Object f1782 = ShenReassemble.LAMBDA.apply(f1776, f1781);

i1783 = f1782;
} else {

i1783 = null;

}
i1784 = i1783;
} else {

i1784 = null;

}final Object f1785 = ShenSndOrFail.LAMBDA.apply(i1784);

i1786 = f1785;
} else {

i1786 = null;

}
final Object result1718 = i1786;

final Object i1809;
if ((boolean)Lang.equals(result1718, null)) {
final Object f1788 = Fst.LAMBDA.apply(v404);


final Object i1799;
if ((boolean)(f1788 instanceof Cons)) {
final Object f1789 = Fst.LAMBDA.apply(v404);

final Object f1790 = Snd.LAMBDA.apply(v404);
final Object f1791 = ShenReassemble.LAMBDA.apply(((Cons)f1789).tail, f1790);
final Object f1792 = Fst.LAMBDA.apply(f1791);
final Object f1793 = Fst.LAMBDA.apply(v404);



final Object i1797;
if ((boolean)(((Cons)f1793).head instanceof Cons)) {
final Object f1794 = Fst.LAMBDA.apply(v404);

final Object f1795 = Atp.LAMBDA.apply(((Cons)f1794).head, Nil.NIL);
final Object f1796 = Interror.LAMBDA.apply("~A is not a legitimate constructor~%", f1795);

i1797 = f1796;
} else {

i1797 = null;

}final Object f1798 = ShenReassemble.LAMBDA.apply(f1792, i1797);

i1799 = f1798;
} else {

i1799 = null;

}
final Object result1787 = i1799;

final Object i1808;
if ((boolean)Lang.equals(result1787, null)) {
final Object f1802 = ShenAsimple_patternZ.LAMBDA.apply(v404);

final Object parse_Asimple_patternZ1801 = f1802;


final Object i1806;
if ((boolean)!((boolean)Lang.equals(null, parse_Asimple_patternZ1801))) {
final Object f1803 = Fst.LAMBDA.apply(parse_Asimple_patternZ1801);
final Object f1804 = Snd.LAMBDA.apply(parse_Asimple_patternZ1801);
final Object f1805 = ShenReassemble.LAMBDA.apply(f1803, f1804);

i1806 = f1805;
} else {

i1806 = null;

}

final Object result1800 = i1806;

final Object i1807;
if ((boolean)Lang.equals(result1800, null)) {

i1807 = null;
} else {

i1807 = result1800;

}

i1808 = i1807;
} else {

i1808 = result1787;

}

i1809 = i1808;
} else {

i1809 = result1718;

}

i1810 = i1809;
} else {

i1810 = result1676;

}

i1811 = i1810;
} else {

i1811 = result1634;

}

i1812 = i1811;
} else {

i1812 = result1592;

}

i1813 = i1812;
} else {

i1813 = result1550;

}

    return i1813;

}
}
